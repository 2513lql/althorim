package com.lql.design.pattern.singleton;

/**
 * Created by LQL on 2017/3/13.
 */
public class Singleton2 {


    /**
     * 饱汉模式
     * 1.当方法被调用时，单例对象被创建，类加载的时候不会被创建
     * 2. 线程非安全，多线程并发的情况下可能会创建多个单例对象
     */
    public static Singleton2 instance;

    public static Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;

    }


}
