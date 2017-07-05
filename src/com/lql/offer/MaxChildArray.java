package com.lql.offer;

/**
 * Created by LQL on 2017/4/18.
 */
public class MaxChildArray {

    public static int getMaxChildArray(int[] A){


        int sum = 0;
        int begin = 0;
        int end = 0;
        int pre = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0 ; i < A.length;i++){
            sum += A[i];
            if (sum < 0){
                if (sum > max){
                    max = sum;
                    end = i;
                    begin = pre;
                }
                pre = i + 1;
                sum = 0;
            }else if (sum > max){
                max = sum;
                end = i;
                begin = pre;
            }
        }
        return max;
    }

}
