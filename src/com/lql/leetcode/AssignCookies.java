package com.lql.leetcode;

import java.util.Arrays;

/**
 * Created by LQL on 2016/11/26.
 */
public class AssignCookies {


    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i = 0,j = 0;
        while (i<g.length && j<s.length){

            if (g[i] <= s[j]){
                count++;
                i++;
                j++;
            }else{
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(findContentChildren(g,s));
    }
}
