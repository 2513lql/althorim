package com.lql.BackTracing;

/**
 * Created by LQL on 2017/1/9.
 *
 * 求集合的所有子集
 */
public class SubSet {


    public static void dfs(int cur,int n,int[] set,int[] res){

        if (cur == n){
            int flag = 1;
            for (int i = 0;i < cur;i++){
                if (res[i] == 1){
                    flag = 0;
                    System.out.print(set[i] + " ");
                }
            }

            if (flag == 1){
                System.out.println("∅");
            }
            System.out.println();
        }
        else{
            for (int i = 1;i >= 0;i--){
                res[cur] = i;
                dfs(cur+1,n,set,res);
            }
        }

    }



    public static void main(String[] args) {
        int[] set = {1,2,3};
        int[] res = new int[3];
        dfs(0,3,set,res);
    }

}
