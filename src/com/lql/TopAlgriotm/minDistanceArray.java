package com.lql.TopAlgriotm;

/**
 * Created by LQL on 2017/3/23.
 *
 * 数组中距离最近的距离
 */
public class minDistanceArray {


    public static int minDistance(int[] A, int a1,int a2){

        int n1_index = -1;
        int n2_index = -1;
        int min = Integer.MAX_VALUE;

        for (int i = 0 ; i < A.length;i++){

            if (A[i] == a1){
                n1_index = i;
                if (n2_index != -1){
                    min = Math.min(min,Math.abs(n1_index - n2_index));
                }
            }
            if (A[i] == a2){

                n2_index = i;
                if (n1_index != -1){
                    min = Math.min(min,Math.abs(n1_index - n2_index));
                }
            }
        }

        return min;

    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,3};
        System.out.println(minDistance(A,2,3));
    }
}
