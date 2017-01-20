package com.lql.sort;

/**
 * Created by LQL on 2016/11/27.
 */
public class HeapSort {



    public static int[] heapSort(int[] A){
        int n = A.length;
        for (int i = 0 ; i < n - 1;i++){
            int m = (n - i) / 2 - 1;
            while (m >= 0){
                if (A[2*m+1]>A[m]){
                    A[m] ^= A[2*m+1];
                    A[2*m + 1] ^= A[m];
                    A[m] ^= A[2*m+1];
                }
                if ((2*m + 2) < (n - i)  && A[2*m+2]>A[m]){
                    A[m] ^= A[2*m+2];
                    A[2*m + 2] ^= A[m];
                    A[m] ^= A[2*m+2];
                }
                m--;
            }
            A[n - 1 -i] ^= A[0];
            A[0] ^= A[n - 1 - i];
            A[n - 1 - i] ^= A[0];
        }
        return A;
    }


    public static void maxHeap(int[] A,int i,int size){

        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < size && A[left] > A[largest])
            largest = left;
        if (right < size && A[right] > A[largest])
            largest = right;
        if (largest != i){
            A[largest] ^= A[i];
            A[i] ^= A[largest];
            A[largest] ^= A[i];
            maxHeap(A,largest,size);
        }
    }

    public static void buildHeap(int[] A,int size){
        for (int i = size / 2 - 1 ; i >= 0;i--){
            maxHeap(A,i,size);
        }

    }

    public static void headSort(int[] A,int size){
        buildHeap(A,size);
        for (int i = size-1;i >= 1;i--){
            swap(A,0,i);
            maxHeap(A,0,i);
        }
    }

    private static void swap(int[] A, int i, int j) {
        A[i] ^= A[j];
        A[j] ^= A[i];
        A[i] ^= A[j];
    }


    public static void main(String[] args) {
        int[] A = {28,213,2,2,435,5,789,2231};
//        A = heapSort(A);
//        buildHeap(A,A.length);
        headSort(A,A.length);
        for (int a : A){
            System.out.print(a + " ");
        }
    }

}
