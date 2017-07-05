package com.lql.Basic;

/**
 * Created by zyczyc on 2017/6/30.
 */
public class StaticTest {


    public StaticTest(){
        System.out.println("this is construct method");
    }

    public static void staticMethod1(){

        System.out.println("this is static method1");

    }

    static {
        System.out.println("this is static block");
    }

    public void method(){
        System.out.println("this is common method");
    }


    public static void main(String[] args) {
        System.out.println("this is main method");
        StaticTest test = new StaticTest();
        test.method();
    }


}
