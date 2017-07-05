package com.lql.Synchronize;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by LQL on 2017/3/10.
 */
public class LockTest {

    Lock lock = new ReentrantLock();

    public void testLock(){

        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "-------->获取了锁");
            for (int i = 0;i < 1000;i++){

            }
        }catch (Exception e){

        }finally {
            System.out.println(Thread.currentThread().getName()+"--------->释放了锁");
            lock.unlock();
        }
    }

    public void testTryLock(){

        if (lock.tryLock()){
            try {
                System.out.println(Thread.currentThread().getName() + "-------->获取了锁");
                for (int i = 0;i < 1000;i++){

                }
            }catch (Exception e){

            }finally {
                System.out.println(Thread.currentThread().getName()+"--------->释放了锁");
                lock.unlock();
            }
        }else {
            System.out.println(Thread.currentThread().getName()+"获取锁失败");
        }
    }


    public static void main(String[] args) {
        LockTest lockTest = new LockTest();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                lockTest.testLock();
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                lockTest.testLock();
//            }
//        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                lockTest.testTryLock();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                lockTest.testTryLock();
            }
        }).start();
    }

}
