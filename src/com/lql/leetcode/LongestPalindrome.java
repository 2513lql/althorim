package com.lql.leetcode;

/**
 * Created by LQL on 2016/11/28.
 */
public class LongestPalindrome {

    public static int longestPalindrome(String s) {
        int res = 0;
        if (s.length() == 0){
            return res;
        }
        int[] s_arr = new int[128];
        for (int i = 0 ; i < s.length();i++){
            char tmp = s.charAt(i);
            s_arr[tmp]++;
        }
        boolean flag = false;
        for (int i = 0; i < s_arr.length;i++){
            int tmp = s_arr[i] / 2;
            res += tmp*2;
            if (s_arr[i] % 2 != 0){
                flag = true;
            }
        }
        if (flag == true){
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }

}
