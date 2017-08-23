package com.lql.Synchronize;

/**
 * Created by LQL on 2017/3/9.
 */
public class MyThread extends Thread{




    private static int n = 10;

    @Override
    public void run() {
        while (n >= 0){
            System.out.println(Thread.currentThread().getName() + "--------" + n--);
        }
    }

}
