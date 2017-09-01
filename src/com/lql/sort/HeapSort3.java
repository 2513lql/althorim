package com.lql.sort;

/**
 * Created by LQL on 2017/2/28.
 */
public class HeapSort3 {


    public static void maxHeap(int[] A,int i,int size){
        int max = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < size && A[max] < A[left]){
            max = left;
        }
        if (right < size && A[max] < A[right]){
            max = right;
        }
        if (max != i){
            swap(A,i,max);
        }
    }

    private static void swap(int[] a, int i, int max) {
    }

    public static void buildHeap(int[] A,int size){
        for (int i = size / 2 -  1; i >= 0;i--){
            maxHeap(A, i , size);
        }
    }

}
