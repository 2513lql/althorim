package com.lql.Synchronize;

/**
 * Created by LQL on 2017/3/10.
 */
public class TieldTest {

    private Object object = new Object();

    public  class Yield implements Runnable{

        @Override
        public void run() {
                System.out.println(Thread.currentThread().getName() + "------before ");
                Thread.currentThread().yield();
                for (int i = 0;i < 5;i++)
                    System.out.println(Thread.currentThread().getName() + "-------after ");
        }
    }


    public static void main(String[] args) {
        TieldTest tieldTest = new TieldTest();
        Yield yield = tieldTest.new Yield();

        for (int i = 0; i < 5;i++){
            Thread thread = new Thread(yield);
            thread.start();
        }
    }

}
