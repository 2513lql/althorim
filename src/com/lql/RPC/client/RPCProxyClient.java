package com.lql.RPC.client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by zyczyc on 2017/8/6.
 */
public class RPCProxyClient<T>{

    @SuppressWarnings("unchecked")
    public static <T> T getRemoteProxyObj(final Class<?> serviceInterface,final InetSocketAddress address){
        //将本地的接口调用转换成JDK动态代理，在动态代理中实现接口的远程调用
        return (T)Proxy.newProxyInstance(serviceInterface.getClassLoader(), new Class<?>[]{serviceInterface}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Socket socket = null;
                ObjectInputStream inputStream = null;
                ObjectOutputStream outputStream = null;
                try {
                    //创建Socket 客户端，根据指定地址链接远程服务提供者
                    socket = new Socket();
                    socket.connect(address);
                    //将远程服务调用所需的接口类，方法名，参数列表等编码后发送给服务提供者
                    outputStream  = new ObjectOutputStream(socket.getOutputStream());
                    outputStream.writeUTF(serviceInterface.getName());
                    outputStream.writeUTF(method.getName());
                    outputStream.writeObject(method.getParameterTypes());
                    outputStream.writeObject(args);

                    //同步阻塞等待服务器返回应答，获取应答后返回
                    inputStream = new ObjectInputStream(socket.getInputStream());
                    return inputStream.readObject();
                }finally {
                    if (socket != null){
                        socket.close();
                    }
                    if (outputStream != null){
                        outputStream.close();
                    }
                    if (inputStream != null){
                        inputStream.close();
                    }
                }
            }
        });

    }

}
