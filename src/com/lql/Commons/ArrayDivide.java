package com.lql.Commons;

/**
 * Created by LQL on 2017/3/3.
 *
 * 数组四等分
 *
 */
public class ArrayDivide {


    public static boolean arrayDivide(int[] arr){


        if (arr.length <= 2) return false;
        int[] sum = new int[arr.length];
        sum[0] = arr[0];
        for (int i = 1;i < arr.length;i++){
            sum[i] = sum[i - 1] + arr[i];
        }

        int left = 0,mid = 0,right = arr.length - 1;
        while (left < right){

            if (sum[left] < sum[right] - sum[right - 1]){
                left++;
            }else if (sum[left] > sum[right] - sum[right - 1]){
                right--;
            }else {
                mid = Math.max(left + 2,mid);
                for (;(sum[mid] - sum[left + 1]) <= sum[left];mid++){
                    if (((sum[mid] - sum[left + 1]) == sum[left]) && ((sum[right-2] - sum[mid + 1]) == sum[left])){
                        return true;
                    }
                }
                left++;
                right--;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        int[] arr = {2,5,1,1,1,1,4,1,7,3,7};
        int[] arr1 = {10,12,11,13,1,1,1,1,1};
        System.out.println(arrayDivide(arr1));


    }


}
