package com.lql.sort;

/**
 * Created by LQL on 2017/3/22.
 */
public class QuickSort2 {


    public static void quickSort(int A[],int low,int high){

        if (low < high){

            int prt = partition(A,low,high);
            quickSort(A,low,prt - 1);
            quickSort(A,prt + 1,high);
        }

    }

    private static int partition(int[] A, int low, int high) {
        int prt = A[low];
        while (low < high){
            while (prt <= A[high] && low < high){
                high--;
            }
            A[low] = A[high];
            while (prt >= A[low] && low < high){
                low++;
            }
            A[high] = A[low];
        }
        A[low] = prt;
        return low;
    }

    public static void main(String[] args) {

        int[] A = {2,3,1,4,5};
        quickSort(A,0,4);
        for (int i : A){
            System.out.print(i + " ");
        }
    }

}
