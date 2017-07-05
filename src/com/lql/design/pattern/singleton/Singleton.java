package com.lql.design.pattern.singleton;

/**
 * Created by LQL on 2017/3/13.
 */
public class Singleton {

    private Singleton(){

    }

    /**
     * 饿汉模式
     * 1.在类加载的时候初始化变量，不存在线程同步问题
     * 2.静态变量初始化后会这个对象会一直驻留在内存中，长期占用内存，除非当类被卸载时
     */
    private static final Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
