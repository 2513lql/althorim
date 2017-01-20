package com.lql.leetcode;

import java.util.Arrays;

/**
 * Created by LQL on 2016/11/21.
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0 ; i < nums.length - 1;i += 2){
            if (nums[i] != nums[i + 1])
                return nums[i];
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(singleNumber(arr));
    }
}
