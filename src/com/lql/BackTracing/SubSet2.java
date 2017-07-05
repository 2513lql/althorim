package com.lql.BackTracing;

/**
 * Created by LQL on 2017/3/13.
 */
public class SubSet2 {



    public static void dfs(int cur ,int n, int[] set,int[] res){

        if (n == cur){
            int flag = 1;
            for (int i = 0; i < n;i++){
                if (res[i] == 1){
                    flag = 0;
                    System.out.print(set[i] + " ");
                }
            }
            if (flag == 1){
                System.out.print("∅");
            }
            System.out.println();
        }else{
            for (int i = 1; i >= 0 ;i--){
                res[cur] = i;
                dfs(cur + 1,n,set,res);
            }
        }

    }

    public static void main(String[] args) {
        int[] set = {1,2,3};
        int[] res = new int[set.length];
        dfs(0,3,set,res);
    }




}
