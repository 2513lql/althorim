package com.lql.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LQL on 2016/11/21.
 */
public class SumInteger {

    public static int getSum(int a, int b) {

        if (a == 0) return b;
        if (b == 0) return a;
        while (b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static int getSubtract(int a,int b){

        if (a == 0) return ~b + 1;
        if (b == 0) return a;
        b = ~b + 1;
        while (b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public static int mutiple(int a,int b){
        int res = 0;
        while (b != 0){
            if ((b&1) == 1){
                res = getSum(res,a);
            }
            b = b >> 1;
            a = a << 1;
        }
        return res;
    }


    public static int getLast1Bit(int n){
        return n & getSum(~n , 1);
    }

    public static int[] getPrimes(int n){
        boolean flags[] = new boolean[n + 1];
        int[] primes = new int[n / 3 + 1];
        int count = 0;
        for (int i =2 ; i <= n; i++){
            if (!flags[i]){
                primes[count++] = i;
            }
                for (int j = 0 ; j < count && i * primes[j] <= n;j++){
                    flags[i * primes[j]] = true;
                    if (i % primes[j] == 0)
                        break;
                }
        }
        return primes;
    }


    public static void getDiff(int[] A){
        int res = 0;
        for (int i = 0; i < A.length;i++){
            res ^= A[i];
        }
        int index = 0;
        for (int i = 0;i <= 31;i++){
            int tmp = res >> i;
            if ((tmp&1) != 0){
                index = i;
                break;
            }
        }
        res = 1 << index;
        List<Integer> A1 = new ArrayList<>();
        List<Integer> A2 = new ArrayList<>();
        for (int i = 0 ; i < A.length; i++){
            if ((A[i]&res) != 0){
                A1.add(A[i]);
            }else {
                A2.add(A[i]);
            }
        }
        int a1 = 0;
        for (int tmp : A1){
            a1 ^= tmp;
        }
        int a2 = 0;
        for (int tmp : A2){
            a2 ^= tmp;
        }
        System.out.println(a1);
        System.out.println(a2);
    }

    public static void main(String[] args) {
//        System.out.println(getSum(-1,3));
//        System.out.println(2 ^ 3);
//        System.out.println(getSubtract(-2,3));
//        int a = 5;
//        int b = 6;
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
//        System.out.println(a);
//        System.out.println(b);
//        if ((4 & (1 << 2)) != 0){
//
//        }
//        boolean[] flags = new boolean[3];
//        for (boolean b : flags){
//            System.out.println(b);
//        }
//        int[] primes = getPrimes(100);
//        for (int prime : primes){
//            System.out.print(prime + " ");
//        }
//        System.out.println(5 ^ 0);
//        Integer a = 5;
//        a = (((a&0xAAAAAAAA) >> 1) | ((a&0x55555555) << 1));
//        a = (((a&0xCCCCCCCC) >> 2) | ((a&0x33333333) << 2));
//        a = (((a&0xF0F0F0F0) >> 4) | ((a&0x0F0F0F0F) << 4));
//        a = (((a&0xFF00FF00) >> 8) | ((a&0x00FF00FF) << 8));
//        a = (((a&0xFFFF0000) >> 16) | ((a&0x0000FFFF) << 16));
//        System.out.println(Integer.toBinaryString(a));
//
//
//        Integer b = 0x5743AFBC;
//        System.out.println(Integer.toBinaryString(b));
//        Integer tmp1 = (0x5743AFBC&0xFFFF0000) >> 16;
//        Integer tmp2 = (0xf743AFBC&0x0000FFFF) << 16;
//        b = tmp1 | tmp2;
//        System.out.println(Integer.toBinaryString(b));
        int[] A = {1,1,4,30,5,5,7,7};
        getDiff(A);
//        System.out.println(3 & 1);
    }
}
