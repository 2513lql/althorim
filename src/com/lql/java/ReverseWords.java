package com.lql.java;

/**
 * Created by LQL on 2017/3/24.
 */
public class ReverseWords {


    public static String swapWords(String s){

        char[] chars = s.toCharArray();

        swap(chars,0,chars.length - 1);
        int begin = 0;
        for (int i = 1;i < chars.length;i++){
            if (chars[i] == ' '){
                swap(chars,begin,i - 1);
                begin = i + 1;
            }
        }
        swap(chars,begin,chars.length-1);
        return new String(chars);
    }

    private static void swap(char[] chars, int begin, int end) {
        for (int i = begin, j = end; i < j;i++,j--){
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
        }
    }

    public static void main(String[] args) {
        System.out.println(swapWords("you are welcome"));
    }

}
