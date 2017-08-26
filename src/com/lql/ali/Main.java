package com.lql.ali;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by LQL on 2017/4/26.
 */
public class Main {



    public static void getPreDay(String curDay){


        String[] strings = curDay.split("-");

        int year = Integer.parseInt(strings[0]);
        int month = Integer.parseInt(strings[1]);
        int day = Integer.parseInt(strings[2]);

        if (day >= 2){
            day -= 1;
            String res = year + "-" + month + "-" + day;
            System.out.println(res);
        }else if (month > 1){
           month -= 1;
           day = getMonthDays(year,month);
            String res = year + "-" + month + "-" + day;
            System.out.println(res);
        }else {
            year -= 1;
            month = 12;
            day = 31;
            String res = year + "-" + month + "-" + day;
            System.out.println(res);
        }
    }

    public static int getMonthDays(int year , int month){

        switch (month){
            case 1:
                return 31;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    return 29;
                }else {
                    return 28;
                }
            case 3:
                return 31;
            case 5:
                return 31;
            case 7:
                return 31;
            case 8:
                return 31;
            case 10:
                return 31;
            case 12:
                return 31;
            case 4:
                return 30;
            case 6:
                return 30;
            case 9:
                return 30;
            case 11:
                return 30;

        }
      return 0;
    }

    public static void main(String[] args) {
        A a = new A();
        try {
            atomicInteger.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.start();

    }

   static AtomicInteger atomicInteger = new AtomicInteger();

    static class A extends Thread{

        @Override
        public void run() {

            atomicInteger.notify();
            atomicInteger.lazySet(1);

            System.out.println(atomicInteger.get());
        }
    }
}
