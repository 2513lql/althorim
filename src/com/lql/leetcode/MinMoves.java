package com.lql.leetcode;

import java.util.Arrays;

/**
 * Created by LQL on 2016/11/27.
 */
public class MinMoves {


    public static void quickSort(int[] A,int low ,int high){

        if (low < high){
            int partition = getPartion(A,low,high);
            quickSort(A,low,partition - 1);
            quickSort(A,partition + 1,high);
        }

    }

    private static int getPartion(int[] A, int low, int high) {
        int privot = A[low];
        while (low < high){
            System.out.println("low--->" + low);
            System.out.println("high---->" + high);
            while (low < high && A[high] > privot) high--;
            A[low] = A[high];
            while (low < high && A[low] < privot) low++;
            A[high] = A[low];
        }
        A[low] = privot;
        return low;
    }


    public static int minMoves(int[] nums) {

        int count = 0;
        boolean isSame = true;
        for (int i = 0; i < nums.length - 1;i++)
            if (nums[i] != nums[i+1]){
                isSame = false;
                break;
            }
        while (!isSame){
            Arrays.sort(nums);
            for (int i = 0;i < nums.length - 1;i++){
                nums[i]++;
            }
            isSame = true;
            for (int i = 0; i < nums.length - 1;i++)
                if (nums[i] != nums[i + 1]){
                    isSame = false;
                    break;
                }
            count++;
        }
        return count;

    }

    public static int minMoves2(int[] nums) {

        int count = 0;
        if (nums.length <= 1){
            return count;
        }
        int min = nums[0];
        for (int i = 1; i < nums.length;i++)
            min = Math.min(min,nums[i]);
        for (int i = 0; i < nums.length;i++)
            count += (nums[i] - min);

        return count;

    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4};
//        quickSort(A,0,A.length - 1);
        System.out.println(minMoves2(A));

    }

}
