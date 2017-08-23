package com.lql.Synchronize;

import java.util.PriorityQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by LQL on 2017/3/20.
 */
public class ProducerConsumer {

    private static final int queueSize = 10;
    public static PriorityQueue<Integer> queue = new PriorityQueue<>(queueSize);
    Lock lock = new ReentrantLock();
    Condition notFull = lock.newCondition();
    Condition notEmpty = lock.newCondition();


    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        Consumer consumer = pc.new Consumer();
        Producer producer = pc.new Producer();
        Thread t1 = new Thread(consumer);
        Thread t2 = new Thread(producer);
        t1.start();
        t2.start();
    }

    class Consumer implements Runnable{
        @Override
        public void run() {
            consume();
        }
        private void consume() {
            while (true){
                lock.lock();
                    try {
                        while (queue.size() == 0){
                            try {
                                System.out.println("----->队列为空");
                                notEmpty.await();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        queue.poll();
                        System.out.println("消费者---消费了---" + queue.size());
                        notFull.signal();
                    }finally {
                        lock.unlock();
                    }
            }
        }
    }

    class Producer implements Runnable{

        @Override
        public void run() {
            produce();
        }
        private void produce() {
            while (true){
                lock.lock();
                try {
                    while (queue.size() == queueSize){
                        notFull.await();
                    }
                    queue.offer(1);
                    System.out.println("生产者---生产了---" + queue.size());
                    notEmpty.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }

        }
    }


}
