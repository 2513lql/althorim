package com.lql.greedy;

import java.util.Arrays;

/**
 * Created by zyczyc on 2017/7/2.
 * 贪心
 * 小船过河
 */
public class ShipCrossRiver {


    /**
     *
     * @return
     */
    public static int getMinDistance(int n,int[] times){

        Arrays.sort(times);
        int sum = 0;
        while (n > 3){

            sum += Math.min(2 * times[0] + times[n - 2] + times[n - 1] , 2 * times[1] + times[0] + times[n - 1]);
            n -= 2;
        }
        if (n == 3){
            sum += times[0] + times[1] + times[2];
        }
        if (n == 2){
            sum += times[1];
        }
        sum += times[0];
        return sum;
    }





}
