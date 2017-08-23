package com.lql.offer;

/**
 * Created by LQL on 2017/3/15.
 */
public class BaseExponent {

    public static double Power(double base, int exponent) {


        double res = base;
        int tmp = Math.abs(exponent);
        for (int i = 0; i < tmp - 1;i++){
            res *= base;
        }
        System.out.println(res);
        if (exponent == 0) return 1;
        else if (exponent > 0) return res;
        else  return 1 / res;
    }

    public static double power(double base,int exponent){

        if (exponent == 0){
            return 1;
        }
        if (exponent == 1){
            return base;
        }
        double res = power(base,exponent >> 1);
        res = res * res;
        if ((exponent & 0x1) == 1){
            res *= base;
        }
        return res;

    }


    public static void main(String[] args) {

//        System.out.println(Power(2,-3));
        System.out.println(power(2,3));
    }

}
