package com.lql.offer;

/**
 * Created by LQL on 2017/5/7.
 */
public class MaxSubArray {


    public static int maxSubArray(int[] A){

        if (A == null || A.length <= 1)
            return -1;

        int begin = 0;
        int end = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < A.length;i++){
            if(sum < 0){
                sum = A[i];
                begin = i;
            }else {
                sum += A[i];
            }
            if (sum > max){
                end = i;
                max = sum;
            }
        }
        System.out.println(begin);
        System.out.println(end);
        return max;
    }

    public static void main(String[] args) {
        int[] A = {1,-2,3,2};
        System.out.println(maxSubArray(A));
    }

}
