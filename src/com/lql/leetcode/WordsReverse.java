package com.lql.leetcode;

/**
 * Created by LQL on 2017/3/4.
 *
 * 字符串中的单词逆序
 * "the sky is blue"
 *
 * "blue is sky the"
 */
public class WordsReverse {


    public static String reverseWords(String s){
        String[] words = s.split("\\s+");
        String res = "";
        for (int i = words.length-1;i >0; i--){
            res += words[i] + " ";
        }
        res += words[0];
        return res;
    }


    public static void main(String[] args) {

        System.out.println("*"+reverseWords("the   sky is blue ") + "*");
    }



}
