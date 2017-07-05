package com.lql.Synchronize;

import java.util.List;

/**
 * Created by LQL on 2017/3/9.
 */
public class MyThread2 {

    class Man{

        public synchronized void hello(){
            System.out.println( Thread.currentThread().getName() + "------before hello");
            try {
                this.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            notify();
            System.out.println(Thread.currentThread().getName() + "------after hello");
        }


        public synchronized void notifyThread(){
            this.notify();
        }
    }


    class Woman{

        public synchronized void helloWorld(){

            System.out.println(Thread.currentThread().getName() + "------before hello world");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "------after hello world");
        }
    }


    public void yieldTest(){
        System.out.println(Thread.currentThread().getName() + "----------before yield current thread");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + "----------after yield current thread");
    }
    public static void hehe(){
    }

    public void joinTest(){

        try {
            System.out.println("-----");
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5;i++){
            System.out.println(Thread.currentThread().getName() + " ----- " + i);
        }

    }




    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Man man = myThread2.new Man();
//        for (int i = 0 ; i < 3 ;i++){
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    long begin = System.currentTimeMillis();
//                    man.hello();
//                    long end = System.currentTimeMillis();
//                    System.out.println(end - begin);
//                }
//            }).start();
//        }
//        man.notifyThread();


//        Woman woman = myThread2.new Woman();
//
//        for (int i = 0; i < 5;i++){
//
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    woman.helloWorld();
//                }
//            }).start();
//        }

//        for (int i = 0; i < 2;i++){
//
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    myThread2.yieldTest();
//                }
//            }).start();
//        }

//        for (int i = 0; i < 5;i++){
//
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    myThread2.joinTest();
//                }
//            }).start();
//        }


        for (int i = 0; i < 5;i++){
            Thread thread = new Thread(new MyThreadRunable());
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }



}
