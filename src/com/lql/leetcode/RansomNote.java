package com.lql.leetcode;

/**
 * Created by LQL on 2016/11/27.
 */
public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        boolean res = true;
        int[] r = new int[128];
        int[] m = new int[128];
        for (int i = 0 ; i < ransomNote.length();i++){
            char tmp = ransomNote.charAt(i);
            r[tmp]++;
        }
        for (int i = 0 ; i < magazine.length();i++){
            char tmp = magazine.charAt(i);
            m[tmp]++;
        }
        for (int i = 0 ;i < r.length;i++){
            if (r[i] > m[i]){
                res = false;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aab"));
    }
}
