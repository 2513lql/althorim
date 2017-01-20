package com.lql.dynamic;

/**
 * Created by LQL on 2017/1/8.
 */
public class BadNeighbors2 {

    public static int dynamic2(int[] A){

        int[] dp = new int[A.length];
        dp[0] = A[0];
        dp[1] = Math.max(A[0],A[1]);

        for (int i = 2; i < A.length;i++){

            int max = A[i];
            for (int j = 0 ; j < i - 1;j++){
                max = Math.max(dp[j] + A[i],max);
            }
            dp[i] = max;
        }
        return dp[A.length - 1];
    }

    public static void main(String[] args) {
        int[] A = { 10, 3, 2, 5, 7, 8};
        System.out.println(dynamic2(A));
    }

}
