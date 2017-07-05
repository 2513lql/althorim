package com.lql.Synchronize;

/**
 * Created by LQL on 2017/3/9.
 */
public class ThreadTest {


    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

        System.out.println("---------------");

//        MyThreadRunable myThreadRunable = new MyThreadRunable();
//        Thread thread1 = new Thread(myThreadRunable);
//        Thread thread2 = new Thread(myThreadRunable);
//
//        thread1.start();
//        thread2.start();
    }

}
