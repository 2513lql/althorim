package com.lql.leetcode;

/**
 * Created by LQL on 2016/11/21.
 */
public class ReverseString {

    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0 ; i < chars.length / 2;i++){
            char cur1 = chars[i];
            char cur2 = chars[chars.length - i -1];
            char tmp = cur1;
            chars[i] = cur2;
            chars[chars.length - i -1] = cur1;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }

}
