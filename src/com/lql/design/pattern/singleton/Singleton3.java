package com.lql.design.pattern.singleton;

/**
 * Created by LQL on 2017/3/13.
 */
public class Singleton3 {

    private static Singleton3 instance;

    /**
     * 线程安全的饱汉式实现
     * @return
     */
    public synchronized static Singleton3 getInstance(){
        if (instance == null){
            instance = new Singleton3();
        }
        return instance;
    }


    /**
     * 优化的线程安全饱汉式实现
     * @return
     */
    public static Singleton3 getInstance2(){

        if (instance == null){
            synchronized (Singleton3.class){
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

}
