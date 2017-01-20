package com.lql.BackTracing;

/**
 * Created by LQL on 2017/1/8.
 */
public class AllPermutation2 {


    public static void dfs(int cur ,int n , char[] chars,char[] res,boolean[] isVisited){

        if (cur == n){
            String buf = new String();
            for (int i = 0 ; i < res.length;i++){
                buf += res[i];
            }
            System.out.println(buf);
        }else{
            for (int i = 0 ;i < n;i++){
                if (!isVisited[i]){
                    isVisited[i] = true;
                    res[cur] = chars[i];
                    dfs(cur + 1,n,chars,res,isVisited);
                    isVisited[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] chars = {'A','B','C','C'};
        char[] res = new char[4];
        boolean[] isVisited = new boolean[4];
        dfs(0,4,chars,res,isVisited);
    }
}
