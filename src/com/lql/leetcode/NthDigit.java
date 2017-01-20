package com.lql.leetcode;

import java.util.Map;

/**
 * Created by LQL on 2016/11/8.
 */
public class NthDigit {

    public static int findNthDigit(int n) {
        long num = 9;
        int count = 1;
        long last = 0;
        while (num < n){
            last = num;
            num = num + (long) Math.pow(10,count) * 9 *(++count);
        }
        long cur = n - last;
        int thNum =(int) Math.ceil(cur * 1.0 / count);
        int thdig =(int) cur % count;
        thdig = thdig == 0 ? count : thdig;
        Integer targetNum =(int) (Math.pow(10,count - 1) + thNum - 1);
        String str = String.valueOf(targetNum);
        int res = str.charAt(thdig - 1) - '0';
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findNthDigit(10000));
    }
}
