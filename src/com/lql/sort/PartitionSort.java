package com.lql.sort;

/**
 * Created by LQL on 2017/2/28.
 */
public class PartitionSort {

    public static void merge(int[] A,int low ,int mid,int high,int[] tmp){

        int begin1 = low,begin2 = mid + 1;
        int k = begin1;
        while (begin1 <= mid && begin2 <= high){

            if (A[begin1] <= A[begin2]){
                tmp[k++] = A[begin1++];
            }else {
                tmp[k++] = A[begin2++];
            }
        }

        while (begin1 <= mid){
            tmp[k++] = A[begin1++];
        }
        while (begin2 <= high){
            tmp[k++] = A[begin2++];
        }
        for (int i = low;i <= high;i++){
            A[i] = tmp[i];
        }
    }

    public static void partition(int[] A,int low,int high,int[] tmp){
        if (low < high){
            int mid = (low + high) / 2;
            partition(A,low , mid , tmp);
            partition(A,mid + 1,high,tmp);
            merge(A,low,mid,high,tmp);
        }
    }

    public static void main(String[] args) {
        int[] A = {2,3,1,5,4};
        int[] tmp = new int[A.length];
        partition(A,0,A.length - 1,tmp);
        for (int i = 0 ; i < A.length ;i++){
            System.out.print(A[i] + " ");
        }
    }

}
