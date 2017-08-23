package com.lql.offer;

/**
 * Created by LQL on 2017/3/22.
 *
 * 将数组中的奇数放到偶数前边
 */
public class OddEvenExchange {

    public static void exchangeOddEven(int[] A){

        if (A == null || A.length <= 1){
            return;
        }

        int left = 0;
        int right = A.length - 1;

        while (left < right){

            if ((A[left] & 0x1) == 0 && (A[right] & 0x1) == 1){
                swap(A,left,right);
                right--;
                left++;
            }
            else if ((A[right] & 0x1) == 0){
                right--;
            }else if((A[left] & 0x1) == 1){
                left++;
            }
        }
    }

    private static void swap(int[] a, int left, int right) {
        a[left] ^= a[right];
        a[right] ^= a[left];
        a[left] ^= a[right];
    }

    public static void main(String[] args) {
        int[] A = {3,2,4,2,5};
        exchangeOddEven(A);
        for (int i : A){
            System.out.print(i + " ");
        }
    }

}
