package com.lql.RPC;

import com.lql.RPC.client.RPCProxyClient;
import com.lql.RPC.registercenter.Server;
import com.lql.RPC.registercenter.ServiceCenter;
import com.lql.RPC.server.HelloService;
import com.lql.RPC.server.HelloServiceImpl;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by zyczyc on 2017/8/6.
 */
public class Test {

    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    Server serviceServer = new ServiceCenter(8088);
                    serviceServer.register(HelloService.class, HelloServiceImpl.class);
                    serviceServer.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        HelloService helloService = RPCProxyClient.getRemoteProxyObj(HelloService.class,new InetSocketAddress("127.0.0.1",8088));
        System.out.println(helloService.sayHello("小明"));

    }


}
