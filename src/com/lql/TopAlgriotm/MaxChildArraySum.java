package com.lql.TopAlgriotm;

import com.lql.sort.InsertSort;
import com.lql.sort.PartitionSort;

/**
 * Created by LQL on 2017/3/7.
 */
public class MaxChildArraySum {

    public static int maxChildArraySum(int[] A){

        if (A == null || A.length <= 0)
            return Integer.MIN_VALUE;
        int max = A[0],sum = 0;
        int begin = 0,end = 0;
        int pre = begin;
        for (int i = 0 ; i < A.length;i++){
            sum += A[i];
            if (sum >= 0){
                if (sum > max){
                    max = sum;
                    begin = pre;
                    end = i;
                }
            }else {
                if (sum > max){
                    max = sum;
                    begin = pre;
                    end = i;
                }
                pre = i + 1;
                sum = 0;
            }
        }
        System.out.println(begin);
        System.out.println(end);
        return max;
    }

    public static int maxSubArraySum(int[] A){
        if (A == null || A.length == 0){
            return Integer.MIN_VALUE;
        }
        int sum = 0,max = A[0];
        for (int i = 0; i < A.length;i++){
            sum += A[i];
            if (sum >= 0) {
                if (sum > max){
                    max = sum;
                }
            }else {
                if (sum > max){
                    max = sum;
                }
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        int[] A = {1,-2,3,10,-4,7,2,-5};
        int[] A = {-3,-2,-1};
        System.out.println(maxChildArraySum(A));
    }

}
