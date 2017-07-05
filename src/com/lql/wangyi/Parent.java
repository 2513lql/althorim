package com.lql.wangyi;

/**
 * Created by LQL on 2017/4/7.
 */
public class Parent {

    private volatile int a = 1;
    int [] ar={a};

    private static void pr(){
        System.out.println("pr");
    }


    public static void main(String[] args) {
        ((Parent)null).pr();
    }

}

class Ch extends Parent{

    private final  void pr(){
        System.out.println("ch");
    }
//    public static void main(String[] args) {
//        int x = 5,t = 5;
//        int a,b;
//        a = x++;
//        b = ++t;
//        System.out.println(" a = "+a);
//        System.out.println(" b = " +b);
//    }
}


