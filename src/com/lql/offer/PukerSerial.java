package com.lql.offer;

import java.util.Arrays;

/**
 * Created by LQL on 2017/5/21.
 *
 * 扑克中的顺子
 *
 */
public class PukerSerial {


    public static boolean isSerial(int[] A , int n){

        int diff = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i < A.length;i++){

            if (A[i] != 0 && A[i] < min){
                min = A[i];
            }
            if (A[i] != 0 && max < A[i]){
                max = A[i];
            }
        }
        diff = max - min;
        if (diff >= n) return false;
        else return true;
    }

    /*扑克中数字是否连续*/
    public static boolean pukerIsSerial(int[] A,int n){
        Arrays.sort(A);
        int i = 0;
        for (; i < A.length;i++){
            if (A[i] != 0) break;
        }
        int count = i;
        for (;i < A.length - 1;i++){
            if (A[i + 1] - A[i] == 0){
                return false;
            }else if (A[i + 1] - A[i] > 1){
                int diff = A[i + 1] - A[i] - 1;
                if (diff > count) return false;
                count -= diff;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = {0,0,1,5,5};
//        System.out.println(isSerial(A,5));

        System.out.println(pukerIsSerial(A,5));
    }

}
