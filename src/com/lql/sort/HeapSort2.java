package com.lql.sort;

/**
 * Created by LQL on 2017/1/15.
 */
public class HeapSort2 {


    public static void maxHead(int[] A,int i,int size){

        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < size && A[left] > A[largest]){
            largest = left;
        }
        if (right < size && A[right] > A[largest]){
            largest = right;
        }
        if (largest != i)
            swap(A,i,largest);
    }

    public static void swap(int[] A,int i,int j){
        A[i] = A[i] ^ A[j];
        A[j] = A[i] ^ A[j];
        A[i] = A[i] ^ A[j];
    }

    public static void buildHeap(int[] A,int size){
        int n = size / 2 - 1;
        for (int i = n; i >=0;i--){
            maxHead(A,i,size);
        }
    }

    public static void heapSort(int[] A,int size){
        while (size > 0){
            buildHeap(A,size);
            size--;
            if (size >= 1) {
                swap(A, 0, size);
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {2,3,4,5,1,6};
        heapSort(A,6);
        for (int i : A){
            System.out.print(i + " ");
        }
    }
}
