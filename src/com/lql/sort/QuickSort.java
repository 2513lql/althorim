package com.lql.sort;

/**
 * Created by LQL on 2016/11/26.
 */
public class QuickSort {

    public static int getPartition(int[] A,int low,int high){

        int privot = A[low];
        while (low < high){
            while (low < high && A[high] >= privot) high--;
            A[low] = A[high];
            while (low < high && A[low] <= privot) low++;
            A[high] = A[low];
        }
        A[low] = privot;
        return low;
    }

    public static void quickSort(int[] A,int low,int high){
        if (low < high){
            int privotPosition = getPartition(A,low,high);
            quickSort(A,low,privotPosition - 1);
            quickSort(A,privotPosition + 1 , high);
        }
    }
    public static void main(String[] args) {
        int[] A = {2,3,1,4,5};
        quickSort(A,0,A.length - 1);
        for (int a : A){
            System.out.print(a + " ");
        }
    }


}
