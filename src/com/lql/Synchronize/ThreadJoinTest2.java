package com.lql.Synchronize;

/**
 * Created by LQL on 2017/4/8.
 */
public class ThreadJoinTest2 {


    public static void main(String[] args) {

        Thread thread = Thread.currentThread();

        Thread previous = thread;
        for (int i = 0; i < 10;i++){

            JoinTest joinTest = new JoinTest(previous);
            Thread thread1 = new Thread(joinTest);
            previous = thread1;
            thread1.start();
        }
        System.out.println("main terminal");

    }


    static class JoinTest implements Runnable{

        private Thread thread;
        public JoinTest(Thread thread){
            this.thread = thread;
        }
        @Override
        public void run() {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName() + " --- > terminal");
        }
    }

}
