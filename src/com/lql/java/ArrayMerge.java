package com.lql.java;

/**
 * Created by LQL on 2017/3/24.
 * 数组中两个有序段合并，要求O(1)空间复杂度
 */
public class ArrayMerge {


    public static void merge(int[] A,int mid){

        for (int i = 0; i < mid;i++){
            if (A[mid] < A[i]){
                int tmp = A[i];
                A[i] = A[mid];
                A[mid] = tmp;
                insert(A,mid);
            }

        }
    }

    public static void insert(int[] A,int mid){

        for (int i = mid; i < A.length - 1;i++){
            if (A[i + 1] < A[i]){
                int tmp = A[i + 1];
                A[i + 1] = A[i];
                A[i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {1,4,7,2,3,5,6,9};
        merge(A,3);
        for (int i : A){
            System.out.print(i + " ");
        }
    }

}
