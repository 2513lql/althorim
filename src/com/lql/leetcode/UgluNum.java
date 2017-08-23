package com.lql.leetcode;

/**
 * Created by LQL on 2017/1/6.
 */
public class UgluNum {

    public static boolean isUglyNum(int num){

        if (num == 0) return false;

        while (num % 5 == 0){
            num = num / 5;
        }

        while (num % 3 == 0){
            num = num / 3;
        }

        while (num % 2 == 0){
            num = num / 2;
        }

        if (num == 5 || num == 3 || num == 2 || num == 1){
            return true;
        }else{
            return false;
        }
    }

    public static int nthUglyNumber(int n) {
        int count = 0 ;
        int i = 1;
        while (count != n){
            if (isUglyNum(i)){
                count++;
            }
            i++;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(1352));
    }
}
