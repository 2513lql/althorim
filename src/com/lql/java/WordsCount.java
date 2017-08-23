package com.lql.java;

/**
 * Created by LQL on 2017/3/24.
 */
public class WordsCount {


    public static int wordsCount(String s){


//        String[] strings = s.split("\\S+");

        int word = 0;
        int count = 0;
        for (int i = 0; i < s.length();i++){
            if (s.charAt(i) == ' '){
                word = 0;
            }else if (word == 0){
                count++;
                word = 1;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(wordsCount(" I  am doy"));
    }
}
