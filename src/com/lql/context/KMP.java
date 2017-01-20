package com.lql.context;

/**
 * Created by LQL on 2017/1/12.
 */
public class KMP {

    public static int isContainsSubStr(String str1,String subStr){

        int index = -1;
        char[] subChars = subStr.toCharArray();
        int[] matchArr = new int[subChars.length];
        int subLenghth = subChars.length;
        for (int i = 1; i < subLenghth;i++){
            int count = 0;
            for (int begin = 0,end = i; begin < end; begin++,end--){

            }
            matchArr[i] = count;
        }
        for (int i = 0 ; i < subLenghth;i++){
            System.out.print(matchArr[i]);
        }
        System.out.println();
        return index;
    }

    public static void main(String[] args) {
        System.out.println(isContainsSubStr("BBC ABCDAB ABCDABCDABDE","ABCDABD"));
    }
}
