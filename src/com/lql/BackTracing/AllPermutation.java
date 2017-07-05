package com.lql.BackTracing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LQL on 2016/12/2.
 */
public class AllPermutation {

    public static void dfs(int cur , int n, char[] chars, List<String> res){
        if (cur == n){
            StringBuffer buffer = new StringBuffer();
            for (char c : chars){
                buffer.append(c);
            }
            res.add(buffer.toString());
        }else{
            for (int i = cur ;i < n;i++){
                swap(cur,i,chars);
                dfs(cur + 1,n,chars,res);
                swap(cur,i,chars);
            }
        }
    }

    private static void swap(int cur, int i, char[] chars) {
        char tmp = chars[cur];
        chars[cur] = chars[i];
        chars[i] = tmp;
    }

    public static void main(String[] args) {
        char[] chars = {'A','B','C','C'};
        List<String> res = new ArrayList<>();
        dfs(0,chars.length,chars,res);
        for (String s : res){
            System.out.println(s);
        }
    }


}
