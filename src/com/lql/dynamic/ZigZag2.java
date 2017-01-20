package com.lql.dynamic;

/**
 * Created by LQL on 2017/1/8.
 */
public class ZigZag2 {


    public static int dynamic(int[] A){

        int[] dp = new int[A.length];
        int[] flag = new int[A.length];
        if (A.length <= 2){
            return A.length;
        }
        dp[0] = 1;
        dp[1] = 2;
        flag[1] = A[1] - A[0];
        for (int i = 2 ; i < A.length;i++){

            for (int j = 1;j < i;j++){
                if (flag[j] > 0 && A[i] - A[j] < 0){
                    dp[i] = dp[j] + 1;
                    flag[i] = A[i] - A[j];
                }else if (flag[j] < 0 && A[i] - A[j] > 0){
                    dp[i] = dp[j] + 1;
                    flag[i] = A[i] - A[j];
                }else{
                    dp[i] = dp[j];
                    flag[i] = flag[j];
                }
            }
        }
        return dp[A.length - 1];
    }

    public static void main(String[] args) {
        int[] A = {70, 55, 13, 2, 99, 2, 80, 80, 80, 80, 100, 19, 7, 5, 5, 5, 1000, 32, 32};
        System.out.println(dynamic(A));
    }
}
