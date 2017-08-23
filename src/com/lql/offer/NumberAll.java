package com.lql.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by LQL on 2017/5/7.
 *
 * 数字全排列
 */
public class NumberAll {


    public static boolean is35Serial(char[] chars){
//        System.out.println(chars);
        for (int i = 0 ; i < chars.length - 1;i++){
            if ((chars[i] == '3' && chars[i + 1] == '5') || (chars[i] == '5' && chars[i + 1] == '3')){
                return false;
            }
            if (chars[i] == '4' && i == 2){
                return false;
            }
        }
        return true;
    }

    public static void dfs(int[] A,int n,int cur,char[] curRes,Set<String> res,boolean[] isVisit){

        if (n == cur){
//            System.out.println(curRes);
            if (is35Serial(curRes)){
                res.add(new String(curRes));
            }
        }else {
            for (int i = 0 ; i < A.length;i++){
                int a = A[i];
                if (isVisit[i] == false){
                    isVisit[i] = true;
                    curRes[cur] = (char)(a + '0');
                    dfs(A,n,cur+1,curRes,res,isVisit);
                    isVisit[i] = false;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,2};
        Set<String> set = new HashSet<>();
        boolean[] isVisit = new boolean[A.length];
        char[] curRes = new char[A.length];
        dfs(A,A.length,0,curRes,set,isVisit);
        for (String s : set){
            System.out.println(s);
        }
    }

}
