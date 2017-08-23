package com.lql.Basic;

/**
 * Created by LQL on 2017/3/5.
 */
public class Child extends Father{

    public Child(){
        System.out.println("this is child");
    }


    static{
        System.out.println("this is static block");
    }

    public static void staticMethod(){
        System.out.println("this is a static method");
    }

    public static void main(String[] args) {
        new Child();

    }

}
