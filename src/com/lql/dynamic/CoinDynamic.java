package com.lql.dynamic;

/**
 * Created by LQL on 2017/1/8.
 */
public class CoinDynamic {

    public static void dynamic(){

        int[] money = {1,3,5};
        int[] dp = new int[12];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2 ; i <= 11;i++){
            int min = Integer.MAX_VALUE - 1;
            for (int j = 0 ; j < 3;j++){
                if (i - money[j] >= 0){
                    min = Math.min(dp[i - money[j]] + 1,min);
                }
            }
            dp[i] = min;
        }
        for (int i = 0;i <= 11;i++){
            System.out.println(dp[i]);
        }
    }

    public static void main(String[] args) {
        dynamic();
    }

}
