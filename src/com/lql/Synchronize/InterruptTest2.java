package com.lql.Synchronize;

/**
 * Created by LQL on 2017/4/8.
 */
public class InterruptTest2 implements Runnable{

    public static void main(String[] args) {

        InterruptTest2 interruptTest2 = new InterruptTest2();
        Thread thread = new Thread(interruptTest2);
        thread.start();

        System.out.println("---------main");
        thread.interrupt();

    }



    @Override
    public void run() {

        try {

            Thread.currentThread().sleep(5000);
            System.out.println("------over");

        } catch (InterruptedException e) {
//            e.printStackTrace();
        }
        System.out.println("------------->interupt");
    }
}
