package com.lql.proxy;

/**
 * Created by LQL on 2017/3/14.
 */
public class RealSubject implements Subject{

    @Override
    public void hello() {
        System.out.println("---------> real subject method");
    }

}
