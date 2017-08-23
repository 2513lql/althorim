package com.lql.binary.search;

/**
 * Created by LQL on 2017/5/19.
 *
 * 数字在排序数组中出现的次数
 *
 *
 */
public class NumberCountInSortArray {


    public static int getFirstK(int[] A,int low,int high,int k){

        if (high < low) return -1;
        int mid = (low + high) / 2;

        if (A[mid] == k){
            if ((mid > 0 && A[mid - 1] != k) || mid == 0){
                return mid;
            }else {
                high = mid - 1;
            }
        }else if (A[mid] > k){
            high = mid - 1;
        }else {
            low = mid + 1;
        }
        return getFirstK(A,low,high,k);
    }

    public static int getLastK(int[] A,int low,int high,int k){
        if (high < low) return -1;
        int mid = (low + high) / 2;

        if (A[mid] == k){
            if (mid < A.length - 1 && A[mid + 1] != k || mid == A.length - 1){
                return mid;
            }else {
                low = mid + 1;
            }
        }else if (A[mid] > k){
            high = mid - 1;
        }else {
            low = mid + 1;
        }
        return getLastK(A,low,high,k);

    }

    public static int getNumberOfK(int[] A,int low,int high,int k){

        int number = 0;
        if (A != null){

            int begin = getFirstK(A,low,high,k);
            int end = getLastK(A,low,high,k);
            number = end - begin + 1;
            System.out.println("--------->" + begin);
            System.out.println("--------->" + end);
        }
        return number;
    }

    public static void main(String[] args) {
        int[] A = {3,3,3,3,3,3,3,3};
        System.out.println(getNumberOfK(A,0,7,3));
    }

}
