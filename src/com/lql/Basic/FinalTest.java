package com.lql.Basic;

/**
 * Created by LQL on 2017/3/5.
 */
public class FinalTest {


    private String str = "je";
    public static void main(String[] args) {


        String a = "hello2";
        final String b = "hello";
        String c = b + "2";
        System.out.println(a == c);
    }



}
