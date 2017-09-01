package com.lql.JD;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/7.
 */
public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[][] dp = new double[111][111];
        int n = scanner.nextInt();
        double[] pis = new double[111];
        for (int i = 1 ;i <= n;i++){
            int tmp = scanner.nextInt();
            pis[i] = tmp * 1.0 / 100;
        }


        for (int i = 1 ; i <= n;i++){
            for (int j = 1;j <= n;j++){
                dp[i][j] = 0.0;
            }
        }
        dp[1][0] = 1 - pis[1];
        dp[1][1] = pis[1];

        for (int i = 2; i <= n;i++){
            for (int j = 0; j <= i;j++){
                if (j > 0){
                    dp[i][j] = dp[i - 1][j - 1]*pis[i] + dp[i -1][j]*(1 - pis[i]);
                }else {
                    dp[i][j] = dp[i - 1][j]*(1 - pis[i]);
                }
            }
        }

        int count = 0;
        double res = 0.0;
        if (n * 6 % 10 == 0){
            count = n * 6 /10;
        }else {
            count = n * 6 / 10 + 1;
        }
        for (int i = count ; i <= n;i++){
            res += dp[n][i];
        }
        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.println(df.format(res));
    }

}
