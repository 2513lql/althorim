package com.lql.TopAlgriotm;

/**
 * Created by LQL on 2017/5/11.
 *
 * 最长回文子序列
 */
public class LongestPalindromic {




    public static String getlongestPalindromic(String str){
        if (str == null){
            return null;
        }
        if (str.length() <= 1){
            return str;
        }
        String longest = str.substring(0,1);
        for (int i = 0 ; i < str.length() - 1;i++){
            String tmp = helper(str,i,i);
            if (tmp.length() > longest.length()){
                longest = tmp;
            }
            tmp = helper(str,i,i + 1);
            if (tmp.length() > longest.length()){
                longest = tmp;
            }
        }
        return longest;
    }

    public static String helper(String str,int begin,int end){
        while (begin >=0 && end < str.length() && str.charAt(begin) == str.charAt(end)){
            begin--;
            end++;
        }
        return str.substring(begin+1,end);
    }


    public static void main(String[] args) {

        String str = "aaacbbcaaabbc";

        System.out.println(getlongestPalindromic(str));
    }



}
