package com.lql.TopAlgriotm;

/**
 * Created by LQL on 2017/3/7.
 *
 * 最大子数组和
 */
public class MaxChildArraySum {


    //
    public static int maxChildArraySum(int[] A){

        int start = 0,end = 0;
        int curSum = 0,greatSum = Integer.MIN_VALUE;

        for (int i = 0; i < A.length;i++){

            if (curSum >= 0){
                curSum += A[i];
            }else {
                curSum = A[i];
                start = i;
            }

            if (curSum > greatSum){
                greatSum = curSum;
                end = i;
            }
        }
        return greatSum;
    }

    public static void main(String[] args) {
        int[] A = {-2,-4,-5};
        System.out.println(maxChildArraySum(A));
    }

}
