package com.lql.Synchronize;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by LQL on 2017/3/10.
 */
public class ReadWriteLockTest {

    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();



    public synchronized void read(){
        System.out.println(Thread.currentThread().getName() + "-----> 开始读");
        for (int i= 0; i < 100000;i++){
        }
        System.out.println(Thread.currentThread().getName() + "------> 结束读");
    }


    public void read2(){
        readWriteLock.readLock();
        try {
            System.out.println(Thread.currentThread().getName() + "-----> 开始读");
            for (int i= 0; i < 10000;i++){
            }
            System.out.println(Thread.currentThread().getName() + "------> 结束读");
        }catch (Exception e){

        }finally {
            System.out.println(Thread.currentThread().getName() + "----->释放读锁");
            readWriteLock.readLock().unlock();
        }
    }

    public void write(){
        readWriteLock.writeLock();
        try {
            System.out.println(Thread.currentThread().getName() + "-----> 开始写");
            for (int i= 0; i < 100000;i++){
            }
            System.out.println(Thread.currentThread().getName() + "------> 开始写");
        }catch (Exception e){

        }finally {
            System.out.println(Thread.currentThread().getName() + "----->释放写锁");
            readWriteLock.writeLock().unlock();
        }
    }

    public static void main(String[] args) {

        ReadWriteLockTest readWriteLockTest = new ReadWriteLockTest();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                readWriteLockTest.read();
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                readWriteLockTest.read();
//            }
//        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                readWriteLockTest.read2();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                readWriteLockTest.read2();
            }
        }).start();
    }





}
