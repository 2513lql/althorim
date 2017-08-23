package com.lql.Synchronize;

import java.util.concurrent.locks.Lock;

/**
 * Created by LQL on 2017/3/9.
 */
public class MyThreadRunable implements Runnable{


    private static int n = 10;

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + "-------before");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "-------after");
    }
}
