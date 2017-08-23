package com.lql.contest;

import java.util.Scanner;

/**
 * Created by LQL on 2017/4/2.
 */
public class IStrangePlanet {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n;i++){
            dp[i] = 2*dp[i-1] + 3*dp[i-2];
        }

        System.out.println(dp[n]);


    }


}
