package com.lql.context;

/**
 * Created by LQL on 2016/12/4.
 */
public class NumberSegments {

    public static int countSegments(String s) {
        return s.split(" ").length;
    }

    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John"));
    }

}
