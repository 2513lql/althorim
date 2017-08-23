package com.lql.Synchronize;

/**
 * Created by LQL on 2017/3/10.
 */
public class InterruptTest {


    class Interrupt implements Runnable{

        @Override
        public void run() {

            System.out.println(Thread.currentThread().getName() + "-----before");
            try {
                Thread.currentThread().sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("thread is stop");
        }
    }


    public static void main(String[] args) {

        InterruptTest interruptTest = new InterruptTest();
        Interrupt interrupt = interruptTest.new Interrupt();
        for (int i = 0 ; i < 3;i++){
            Thread thread = new Thread(interrupt);
            thread.start();
        }

    }

}
