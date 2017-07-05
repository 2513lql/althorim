package com.lql.dynamic;

/**
 * Created by zyczyc on 2017/7/1.
 *
 *
 * 01背包问题
 */
public class Bag01 {



    public static int maxBagValue(int host,int[] weight,int[] value){

        int[][] dp = new int[weight.length][host + 1];
        for (int i = 0 ; i < weight.length;i++){
            if (weight[i] <= 1){
                dp[i][1] = value[i];
            }
        }
        for (int j = 1; j < dp[0].length;j++){
            if (j >= weight[0]){
                dp[0][j] = value[0];
            }
        }

        for (int i = 1 ; i < weight.length;i++){
            for (int j = 2; j <= host;j++){
                dp[i][j] = dp[i - 1][j];
                if (j >= weight[i]){
                    dp[i][j] = Math.max(dp[i][j],dp[i - 1][j - weight[i]] + value[i]);
                }
            }
        }
        return dp[weight.length - 1][host];
    }

    public static void main(String[] args) {
        int[] weight = {2,3,1,4,6,5};
        int[] value = {5,6,5,1,19,7};
        System.out.println(maxBagValue(10,weight,value));
    }

}
