package com.lql.leetcode;

/**
 * Created by LQL on 2016/11/29.
 */
public class UniqueCharacter {

    public static int firstUniqChar(String s) {

        int[] s_arr = new int[128];
        for (int i = 0;i < s.length();i++){
            char tmp = s.charAt(i);
            s_arr[tmp]++;
        }

        for (int i = 0 ; i < s.length();i++){
            char tmp = s.charAt(i);
            if (s_arr[tmp] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aadadaad"));
    }

}
