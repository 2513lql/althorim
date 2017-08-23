package com.lql.Synchronize;

/**
 * Created by LQL on 2017/3/11.
 */
public class ThreadLocalTest {


    class Seesion{

        private ThreadLocal<String> threadLocal = new ThreadLocal();

        public String getSession(){
            String session = threadLocal.get();
            if (session == null){
                session = new String(Thread.currentThread().getName());
                threadLocal.set(session);
                System.out.println(Thread.currentThread().getName() + " ------>" +session);
            }
            return session;
        }
    }


    public static void main(String[] args) {
        ThreadLocalTest threadLocalTest = new ThreadLocalTest();
        Seesion seesion = threadLocalTest.new Seesion();
        new Thread(new Runnable() {
            @Override
            public void run() {
                String seesion1 = seesion.getSession();
                System.out.println(seesion1);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                String seesion1 = seesion.getSession();
                System.out.println(seesion1);
            }
        }).start();
    }
}
