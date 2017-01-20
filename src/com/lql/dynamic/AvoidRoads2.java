package com.lql.dynamic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LQL on 2017/1/9.
 */
public class AvoidRoads2 {


    public static long numWays(int width, int height, String[] bad){

        long[][] dp = new long[height + 1][width + 1];
        dp[0][0] = 0;
        List<String> badList = new ArrayList<>();
        for (int i = 0; i < bad.length;i++){
            badList.add(bad[i]);
        }
        for (int i = 1; i < height + 1;i++){
            String tmp1 = (i - 1) + " 0 " + i + " 0";
            String tmp2 = i + " 0 " + (i - 1) + " 0";
            if (badList.contains(tmp1) || badList.contains(tmp2)){
                dp[i][0] = 0;
                break;
            }else{
                dp[i][0] = 1;
            }
        }
        for (int j = 1; j < width + 1;j++){
            String tmp1 = "0 " + j + " 0 " + (j - 1);
            String tmp2 = "0 " + (j - 1) + " 0 " + j;
            if (badList.contains(tmp1) || badList.contains(tmp2)){
                dp[0][j] = 0;
                break;
            }else{
                dp[0][j] = 1;
            }
        }
        for (int i = 1; i <= height;i++){
            for (int j = 1;j <= width;j++){
                int tmp = 0;
                String tmp1 = i + " " + (j - 1) + " " + i + " " + j;
                String tmp2 = i + " " + j + " " + i + " " + (j - 1);
                String tmp3 = (i - 1) + " " + j + " " + i + " " + j;
                String tmp4 = i + " " + j + " " + (i - 1) + " " + j;
                if (!badList.contains(tmp1)&&!badList.contains(tmp2)){
                    tmp += dp[i][j - 1];
                }
                if (!badList.contains(tmp3) && !badList.contains(tmp4)){
                    tmp += dp[i - 1][j];
                }
                dp[i][j] = tmp;
            }
        }
        return dp[width][height];
    }

    public static void main(String[] args) {
        String[] bad = {"0 0 0 1","6 6 5 6"};
        System.out.println(numWays(6,6,bad));
    }
}
