package com.lql.leetcode;

import java.util.Arrays;

/**
 * Created by LQL on 2016/11/29.
 */
public class IntersectionArray2 {

    public static int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] tmp = new int[len1 > len2 ? len2 : len1];
        int count = 0;
        for (int i = 0,j=0 ; i < nums1.length && j < nums2.length;){
            if (nums1[i] == nums2[j]){
                tmp[count++]=nums1[i];
                i++;
                j++;
            }else if (nums1[i] < nums2[j]){
                i++;
            }else {
                j++;
            }
        }
        int[] res = new int[count];
        for (int i = 0 ; i < count;i++){
            res[i] = tmp[i];
        }
        return  res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] res = intersect(nums1,nums2);
        for (int i : res){
            System.out.print(i + " ");
        }
    }

}
