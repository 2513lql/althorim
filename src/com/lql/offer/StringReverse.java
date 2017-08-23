package com.lql.offer;

/**
 * Created by LQL on 2017/5/7.
 */
public class StringReverse {


    public static void reverse(char[] chars,int begin,int end){

        for (int i = begin,j = end ;i < j;i++,j--){

            char c = chars[i];
            chars[i] = chars[j];
            chars[j] = c;
        }
    }

    public static String stringReverse(String string){

        char[] chars = string.toCharArray();
        reverse(chars,0,chars.length - 1);
        int begin = 0;
        for (int i = 0 ; i < chars.length;i++){

            if (chars[i] == ' '){
                reverse(chars,begin,i - 1);
                begin = i + 1;
            }

        }
        reverse(chars,begin,chars.length -1);
        return new String(chars);
    }

    public static void main(String[] args) {
        String str="i am  boy ";
        System.out.println(stringReverse(str));
    }
}
