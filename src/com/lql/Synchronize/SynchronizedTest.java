package com.lql.Synchronize;

/**
 * Created by LQL on 2017/3/10.
 */
public class SynchronizedTest {


    private int n = 20;
    public static synchronized void test2(){
        for (int i = 0 ; i < 20;i++){
            System.out.println(Thread.currentThread().getName() + "----------->" + i);
        }
    }

    class Synchronized{
        private int n = 10;
        public synchronized void test(){
            for (int i = 0 ; i < 20;i++){
                System.out.println(Thread.currentThread().getName() + "---------->" + i);
            }
        }
    }


    public static void main(String[] args) {

        SynchronizedTest synchronizedTest = new SynchronizedTest();
        Synchronized syn = synchronizedTest.new Synchronized();
        Synchronized syn1 = synchronizedTest.new Synchronized();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                syn.test();
//            }
//        }).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                syn.test();
//            }
//        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizedTest.test2();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizedTest.test2();
            }
        }).start();

    }

}
