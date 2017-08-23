package com.lql.RPC.server;

/**
 * Created by zyczyc on 2017/8/6.
 */
public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
