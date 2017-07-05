package com.lql.offer;

/**
 * Created by LQL on 2017/3/15.
 */
public class StringReplace {

    public static String replaceSpace(StringBuffer str) {

        String tmp = str.toString();
        tmp = tmp.replace(" ","%20");
        return tmp;
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("We Are Happy.")));
    }

}
