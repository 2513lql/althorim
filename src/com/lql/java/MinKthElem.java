package com.lql.java;

/**
 * Created by LQL on 2017/3/23.
 *
 * 数组中最小的第K个元素
 *
 */
public class MinKthElem {


    public static int minKthElem(int[] A,int low,int high,int k){
        if (low < high){
            int part = partion(A,low,high);
            System.out.println(part);
            if (part == k - 1){
                System.out.println("-----------");
                return A[part];
            }
            else if (part < k - 1){
               return minKthElem(A,part + 1,high,k);
            }else {
                return minKthElem(A,low,part - 1,k);
            }
        }
        return -1;
    }

    private static int partion(int[] a, int low, int high) {
        int part = a[low];
        while (low < high){
            while (low < high && part<= a[high]){
                high--;
            }
            a[low] = a[high];
            while (low < high && part >= a[low]){
                low++;
            }
            a[high] = a[low];
        }
        a[low] = part;
        return low;
    }

    public static void main(String[] args) {
        int[] A = {2,1,3,4,5};
        System.out.println(minKthElem(A,0,4,3));
    }

}
