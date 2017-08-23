package com.lql.Synchronize;

/**
 * Created by LQL on 2017/3/23.
 */
public class JoinTest {


    public static void main(String[] args) {

        System.out.println("------->main");
        try {
            Thread.sleep(1000);
//            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("------>" + Thread.currentThread().getName() + "begin");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("---------->" + Thread.currentThread().getName() + "end");
//            }
//        });
//        thread1.start();
//        try {
//            thread1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                System.out.println("------>" + Thread.currentThread().getName() + "begin");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("------->" + Thread.currentThread().getName() + "end");
//            }
//        });
//        thread.start();
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("----->main end");
    }



}
