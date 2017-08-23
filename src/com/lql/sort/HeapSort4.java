package com.lql.sort;

/**
 * Created by LQL on 2017/3/22.
 */
public class HeapSort4 {


    public static void maxHeap(int[] A,int i,int size){

        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max = i;
        if (left < size && A[left] > A[max]){
            max = left;
        }
        if (right < size && A[right] > A[max]){
            max = right;
        }
        if (max != i){
            swap(A,i,max);
        }
    }

    private static void swap(int[] a, int i, int max) {
        int tmp = a[max];
        a[max] = a[i];
        a[i] = tmp;
    }


    public static void buildMaxHeap(int[] A,int size){
            for (int i = size / 2 - 1; i >= 0; i--) {
                maxHeap(A, i, size);
            }
    }

    public static void heapSort(int[] A,int size){

        for (int i = size;i > 0;i--){
            buildMaxHeap(A,i);
            swap(A,0,i - 1);
        }
    }


    public static void main(String[] args) {
        int[] A = {2,3,1,5,4};
//        buildMaxHeap(A,5);
//        swap(A,0,4);
        heapSort(A,5);
        for (int i : A){
            System.out.print(i + " ");
        }
    }

}
