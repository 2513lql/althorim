package com.lql.offer;

/**
 * Created by LQL on 2017/5/7.
 */
public class AllSet {

    public static void dfs(char[] chars,int[] res,int n,int cur){

        if (cur == n){
            boolean flag = true;
            StringBuffer buf = new StringBuffer();
            for (int i = 0 ; i < n;i++){
                if (res[i] == 1){
                    buf.append(chars[i]);
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("∅");
            }else {
                System.out.println(buf.toString());
            }
        }else {

            for (int i = 1 ; i >= 0;i--){
                res[cur] = i;
                dfs(chars,res,n,cur+1);
            }
        }
    }


    public static void main(String[] args) {
        char[] c = {'a','b','c'};
        int[] res = {0,0,0};
        dfs(c,res,3,0);
    }

}
