package com.lql.TopAlgriotm;

/**
 * Created by Administrator on 2017/3/8.
 *
 * 字符串数组中寻找一个唯一的字符，其他字符都是两个字符
 */
public class FindOneCharInArray {


    public static void findOneInString(String str){
        char[] chars = str.toCharArray();
        int res = 0;
        for (char c : chars){
            res ^= c;
        }
        char c =(char) res;
        System.out.println(c);
    }

    public static void main(String[] args) {
        findOneInString("ababceeff");
    }

}
