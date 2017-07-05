package com.lql.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by LQL on 2017/3/14.
 */
public class Test {


    public static void main(String[] args) {

        RealSubject realSub = new RealSubject();
        InvocationHandlerImp handler = new InvocationHandlerImp(realSub);
        Subject proxy =(Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),realSub.getClass().getInterfaces(),handler);
        proxy.hello();

    }

}
