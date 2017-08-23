package com.lql.BackTracing;

/**
 * Created by LQL on 2017/3/24.
 *
 */
public class SubSet3 {



    public static void dfs(String s,int cur , int n,int[] res){

        if (cur == n){
            StringBuffer str = new StringBuffer("");
            for (int i = 0; i < n;i++){
                if (res[i] == 1){
                    str.append(s.charAt(i));
                }
            }
            System.out.println(str);
        }else {

            for (int i = 0; i <= 1;i++){
                res[cur] = i;
                dfs(s,cur + 1,n,res);
            }

        }


    }

    public static void main(String[] args) {
        dfs("abc",0,3,new int[3]);
    }

}
