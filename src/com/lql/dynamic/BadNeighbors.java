package com.lql.dynamic;

/**
 * Created by LQL on 2016/10/30.
 */
public class BadNeighbors {


    public static int maxDonations(int[] donations){
        int max = 0;
        if (donations.length <= 3){
            for (int i = 0; i < donations.length;i++){
                if (donations[i] > max){
                    max = donations[i];
                }
            }
            return max;
        }
        int[] dp = new int[donations.length];
        dp[0] = donations[0];
        dp[1] = donations[1] > dp[0] ? donations[1]:dp[0];
        for (int i = 2 ; i < donations.length;i++){
            dp[i] = donations[i];
            for (int j = 0 ; j < i - 1;j++){
                if (dp[j] + donations[i] > dp[i]){
                    dp[i] = dp[j] + donations[i];
                }
            }
//            if (dp[i] < dp[i - 1]){
//                dp[i] = dp[i - 1];
//            }
        }
        return dp[donations.length - 1];
    }
    public static void main(String[] args) {
        int[] donations = { 94, 40, 49, 65, 21, 21, 106, 80, 92, 81, 679, 4, 61,
                        6, 237, 12, 72, 74, 29, 95, 265, 35, 47, 1, 61, 397,
                        52, 72, 37, 51, 1, 81, 45, 435, 7, 36, 57, 86, 81, 72 };
        int[] case1 = new int[donations.length - 1];
        int[] case2 = new int[donations.length - 1];
        for (int i = 0 ; i < donations.length - 1; i++){
            case1[i] = donations[i];
            System.out.print(case1[i] + " ");
        }
        System.out.println();
        for (int i = 1 ; i < donations.length; i++){
            case2[i - 1] = donations[i];
            System.out.print(case2[i - 1] + " ");
        }
        System.out.println();
        int res = maxDonations(case1);
        int res2 = maxDonations(case2);
        System.out.println(res);
        System.out.println(res2);
    }


}
