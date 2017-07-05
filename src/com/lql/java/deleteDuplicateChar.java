package com.lql.java;

/**
 * Created by LQL on 2017/3/24.
 *
 * 删除字符串中重复的字符
 *
 */
public class deleteDuplicateChar {




    public static void deleteChar(String s){
        char[] chars = s.toCharArray();

        int[] arr = new int[256];

        for (int i = 0;i < chars.length;i++){
            if (arr[chars[i] - '0'] == 0){
                arr[chars[i] - '0'] = 1;
            }else {
                chars[i] = '\0';
            }
        }
        System.out.println(new String(chars));
    }

    public static void main(String[] args) {
        deleteChar("abcbcbd");
    }


}
