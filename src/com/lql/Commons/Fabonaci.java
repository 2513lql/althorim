package com.lql.Commons;

/**
 * Created by LQL on 2017/3/3.
 *
 * 菲薄那楔数列非递归
 */
public class Fabonaci {


    public static int fabonaci(int n){

        int[] dp = new int[n];
        if (n <= 2){
            return n;
        }
        else {
            dp[0] = 1;
            dp[1] = 2;
            for (int i = 2;i < n;i++){
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(fabonaci(5));
    }

}
