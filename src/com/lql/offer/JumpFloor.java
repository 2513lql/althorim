package com.lql.offer;

/**
 * Created by LQL on 2017/3/15.
 */
public class JumpFloor {


    public static int JumpFloor(int target) {

        if (target == 0 || target == 1 || target == 2){
            return target;
        }
        int[] dp = new int[target];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2;i < target;i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[target - 1];
    }


    public static void main(String[] args) {
        System.out.println(JumpFloor(5));
    }

}
