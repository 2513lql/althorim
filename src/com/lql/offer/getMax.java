package com.lql.offer;

/**
 * Created by LQL on 2017/5/7.
 */
public class getMax {


    public static int getMax(int[] A){

        int[] diff = new int[A.length];
        int max = A[0];
        diff[0] = Integer.MIN_VALUE;

        for (int i = 1; i < A.length;i++){
            diff[i] = Math.max(diff[i - 1],max - A[i]);
            max = Math.max(max,A[i]);
        }


        return diff[A.length - 1];
    }

    public static void main(String[] args) {
        int[] A = {1,4,17,3,2,9};
        System.out.println(getMax(A));
    }

}
