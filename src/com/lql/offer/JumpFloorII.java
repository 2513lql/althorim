package com.lql.offer;

/**
 * Created by LQL on 2017/3/15.
 */
public class JumpFloorII {

    public static int JumpFloorII(int target) {


        if (target == 0){
            return 0;
        }

        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 1; i <= target;i++){
            dp[i] = 0;
            for (int j = i - 1 ; j >= 0;j--){
                dp[i] += dp[j];
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        System.out.println(JumpFloorII(3));
    }

}
