package com.lql.Synchronize;

import java.util.concurrent.*;

/**
 * Created by LQL on 2017/3/23.
 */
public class CyclicBarrierTest {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("线程执行1------开始执行------>");
                    Thread.currentThread().sleep(500);
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("线程执行2------开始执行------>");
                    Thread.currentThread().sleep(2000);
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable runnable3 = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("线程执行3------开始执行------>");
                    Thread.currentThread().sleep(1000);
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        };


        executorService.submit(runnable1);
        executorService.submit(runnable2);
        executorService.submit(runnable3);
        System.out.println("------->所有线程执行完毕");

    }

}
