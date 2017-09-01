package com.lql.dynamic;

/**
 * Created by LQL on 2017/2/28.
 */
public class ZigZag3 {


    public static int longestZigZag(int[] sequence){

        int[] dp = new int[sequence.length];
        int[] flags = new int[sequence.length];
        if (sequence.length <= 2){
            return sequence.length;
        }
        dp[0] = 1;
        dp[1] = 2;
        flags[1] = sequence[1] - sequence[0];
        for (int i = 2 ; i < sequence.length;i++){
            for (int j = 1 ; j < i;j++){
                int flag = sequence[i] - sequence[j];
                if (flag < 0 && flags[j] > 0){
                    flags[i] = flag;
                    dp[i] = dp[j] + 1;
                }else if (flag > 0 && flags[j] < 0){
                    flags[i] = flag;
                    dp[i] = dp[j] + 1;
                }else{
                    flags[i] = flag;
                    dp[i] = dp[j];
                }
            }
        }

        for (int i = 0 ; i < sequence.length;i++){
            System.out.print(dp[i] + " ");
        }

        return dp[sequence.length - 1];
    }

    public static void main(String[] args) {
        int[] A = {70, 55, 13, 2, 99, 2, 80, 80, 80, 80, 100, 19, 7, 5, 5, 5, 1000, 32, 32};
        System.out.println(longestZigZag(A));
    }


}
