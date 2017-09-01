package com.lql.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Created by LQL on 2017/3/4.
 */
public class WordsCount {


    public static Map<String,Integer> wordsCount(String str){



        Map<String,Integer> map = new HashMap<>();



        return map;

    }

    public static void main(String[] args) {
        String str1 = "[a-zA-z]";
        String s = ",+";
        String sre = "dadad,,dasd,da,,,ad,";
        String[] strings = sre.split(s);
        for (String tmp : strings){
            System.out.println("*"+tmp + "*");
        }

        String str="Sometimes I do things I want to do,the rest of time I do things I have to.@";

        String regex = "[\\s+|,+|.+|;+|'+|\\?+]";
        String[] words = str.split(regex);
        for (String word : words){
            System.out.println(word);
        }
    }

}
