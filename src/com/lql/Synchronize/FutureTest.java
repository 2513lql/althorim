package com.lql.Synchronize;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by LQL on 2017/3/20.
 */
public class FutureTest {




    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        FutureTest futureTest = new FutureTest();
        Future future = executor.submit(futureTest.new Task(5));
//        boolean  res = future.cancel(true);
//        System.out.println(res);
//        try {
//            System.out.println(future.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
        FutureTask<Integer> futureTask = new FutureTask(futureTest.new Task(10));
        executor.submit(futureTask);
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    class Task implements Callable<Integer>{

        private int param;

        public Task(int param){
            this.param = param;
        }
        @Override
        public Integer call(){
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Random random = new Random();
            return param * random.nextInt(100);
        }
    }

}
