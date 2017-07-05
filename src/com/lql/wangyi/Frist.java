package com.lql.wangyi;

/**
 * Created by LQL on 2017/3/25.
 */
public class Frist {



    public static void first(){
        int rres =fib(fib(2));
        System.out.println(rres);
    }

    public static int fib(int x){
        return ((x > 0)?x*fib(x - 1):2);
    }


    public static void main(String[] args) {
        int i = 0;
        int s = (i--) + (--i) + (i++) +(++i);
        System.out.println(s);
    }

}
