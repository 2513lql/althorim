package com.lql.java;

/**
 * Created by LQL on 2017/3/23.
 *
 * 数组循环右移K位
 *
 */
public class CycleShiftK {

    public static void rightShiftK(int[] A,int k){
        k = k % A.length;

        if (k == 0){
            return;
        }
        reverse(A,0,A.length - k - 1);
        reverse(A,A.length-k,A.length - 1);
        reverse(A,0,A.length - 1);
    }

    public static void reverse(int[] A,int i,int j){
        for (;i < j;i++,j--){
            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
        }
    }


    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8};
        rightShiftK(A,9);
        for (int i : A){
            System.out.print(i + " ");
        }
    }


}
