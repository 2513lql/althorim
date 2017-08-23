package com.lql.Synchronize;

import java.util.concurrent.CountDownLatch;

/**
 * Created by LQL on 2017/3/21.
 */
public class CountDownLatchTest {


    public static void main(String[] args) {


        CountDownLatch countDownLatch = new CountDownLatch(2);

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    System.out.println("------------->先countDown");

                    Thread.currentThread().sleep(2000);
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + "----------->countDown");
                    Thread.currentThread().sleep(3000);
                    countDownLatch.countDown();
                    System.out.println("----->");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        try {
            countDownLatch.await();
            System.out.println("------------>他们都完事之后我再执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }





}
