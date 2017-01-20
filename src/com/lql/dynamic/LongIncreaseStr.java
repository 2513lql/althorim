package com.lql.dynamic;

/**
 * Created by LQL on 2017/1/8.
 */
public class LongIncreaseStr {


    public static void longIncreaseSubseq(int[] A){

        int[] dp = new int[A.length];
        dp[0] = 1;
        for (int i = 1;i < A.length;i++){
            int max = 1;
            for (int j = 0; j < i ; j++){
                if (A[j] < A[i]){
                    max = Math.max(dp[j]+1,max);
                }
            }
            dp[i] = max;
        }
        System.out.println(dp[A.length - 1]);
    }

    public static void main(String[] args) {
        int[] A = {2,3,1,0,5};
        longIncreaseSubseq(A);
    }
}
