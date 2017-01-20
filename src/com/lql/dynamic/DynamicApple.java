package com.lql.dynamic;

/**
 * Created by LQL on 2017/1/8.
 */
public class DynamicApple {


    public static void dynamic(int A[][]){
        int[][] dp = new int[A.length][A[0].length];
        dp[0][0] = A[0][0];
        for (int i = 1;i < A.length;i++){
            dp[i][0] = dp[i - 1][0] + A[i][0];
        }
        for (int j = 1;j < A[0].length;j++){
            dp[0][j] = dp[0][j - 1] + A[0][j];
        }
        for (int i = 1;i < A.length;i++){
            for (int j = 1;j < A[0].length;j++){
                dp[i][j] = Math.max(dp[i - 1][j] + A[i][j],dp[i][j -1] + A[i][j]);
            }
        }
        System.out.println(dp[A.length - 1][A[0].length - 1]);
    }

    public static void main(String[] args) {
        int[][] S = {{1,2,3},{4,5,6},{7,8,9}};
        dynamic(S);
    }
}
