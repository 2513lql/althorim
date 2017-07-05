package com.lql.Synchronize;

import java.util.Objects;

/**
 * Created by LQL on 2017/3/10.
 */
public class ThreadJoinTest {

    private Object object = new Object();


    public static void main(String[] args) {

        ThreadJoinTest threadJoinTest = new ThreadJoinTest();
        ThreadJoin threadJoin = threadJoinTest.new ThreadJoin();
        for (int i = 0; i < 5;i++){
            Thread thread = new Thread(threadJoin);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

  public  class ThreadJoin implements Runnable{

        @Override
        public void run() {
            synchronized (object){
                System.out.println(Thread.currentThread().getName() + "------before ");
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-------after ");
            }
        }
    }


}
