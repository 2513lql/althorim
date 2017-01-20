package com.lql.leetcode;

import java.util.BitSet;

/**
 * Created by LQL on 2016/11/29.
 */
public class IntersectionArray {


    public static int[] intersection(int[] nums1, int[] nums2) {
        BitSet nums1_set = new BitSet();
        BitSet res_set = new BitSet();

        for (int i : nums1){
            nums1_set.set(i,true);
        }
        int count = 0;
        for (int i : nums2){
            if (!res_set.get(i)&&nums1_set.get(i)){
                res_set.set(i,true);
                count++;
            }
        }
        int[] res = new int[count];
        int m = 0;
        for (int i = 0 ; i < res_set.size();i++){
            if (res_set.get(i)){
                res[m++] = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] res = intersection(nums1,nums2);
        for (int i : res){
            System.out.print(i + " ");
        }
    }

}
