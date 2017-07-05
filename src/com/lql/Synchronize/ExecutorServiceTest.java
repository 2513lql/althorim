package com.lql.Synchronize;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by LQL on 2017/3/19.
 */
public class ExecutorServiceTest {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        ExecutorService executor2 = Executors.newFixedThreadPool(5);
        ExecutorService executor3 = Executors.newCachedThreadPool();
        ExecutorServiceTest test = new ExecutorServiceTest();
        for (int i = 0; i < 10;i++){
            executor3.execute(test.new Task(i));
        }

    }

    class Task implements Runnable{

        private int num;

        public Task(){
        }

        public Task(int num){
            this.num = num;
        }
        @Override
        public void run() {
            System.out.println("正在执行---->" + num);
            try {
                Thread.currentThread().sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("任务执行完毕---->" + num);
        }
    }
}
