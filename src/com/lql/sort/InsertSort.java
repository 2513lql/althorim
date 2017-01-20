package com.lql.sort;

/**
 * Created by LQL on 2016/11/26.
 */
public class InsertSort {

    public static int[] insertSort(int[] A){

        for (int i = 1;i < A.length;i++){

            int tmp = A[i];
            int j = i - 1;
            for (;j >= 0 && tmp <= A[j];j--){
                A[j + 1] = A[j];
            }
            A[j + 1] = tmp;
        }
        return A;
    }

    public static int[] insertSort2(int[] A){
        for (int i = 1;i < A.length;i++){
            int tmp = A[i];
            int low = 0,high = i - 1;
            while (low <= high){
                int mid = (low + high) / 2;
                if (A[mid] < tmp) low = mid + 1;
                else high = high - 1;
            }
            int j = i - 1;
            for (;j >= high + 1;j--){
                A[j+1] = A[j];
            }
            A[high + 1] = tmp;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,1,2,4};
        for (int a : A){
            System.out.print(a + " ");
        }
    }






}
