package com.lql.dynamic;

/**
 * Created by LQL on 2017/3/2.
 */
public class BadNeighbors3 {



    public static int maxDonations(int[] donations){


        if (donations.length == 0) return 0;
        if (donations.length == 1) return donations[0];
        if (donations.length == 2) return Math.max(donations[0],donations[1]);

        int[] dp = new int[donations.length];
        dp[0] = donations[0];
        for (int i = 1; i < donations.length - 1;i++){
            dp[i] = donations[i];
            for (int j = 0 ; j < i - 1;j++){
                if (dp[j] + donations[i] > dp[i]){
                    dp[i] = dp[j] + donations[i];
                }
            }
        }

        int[] dp1 = new int[donations.length];
        dp1[1] = donations[1];
        for (int i = 2; i< donations.length;i++){
            dp1[i] = donations[i];
            for (int j = 1; j < i - 1;j++){
                if (dp1[j] + donations[i] > dp1[i]){
                    dp1[i] = dp1[j] + donations[i];
                }
            }

        }
        System.out.println(dp[donations.length - 2]);
        System.out.println(dp1[donations.length - 1]);
        return Math.max(dp[donations.length - 2],dp1[donations.length - 1]);
    }

    public static void main(String[] args) {
        int[] donations = { 94, 40, 49, 65, 21, 21, 106, 80, 92, 81, 679, 4, 61,
                6, 237, 12, 72, 74, 29, 95, 265, 35, 47, 1, 61, 397,
                52, 72, 37, 51, 1, 81, 45, 435, 7, 36, 57, 86, 81, 72 };

        int[] A = { 10, 3, 2, 5, 7, 8};
        System.out.println(maxDonations(A));
    }

}
