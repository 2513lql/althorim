package com.lql.BackTracing;

/**
 * Created by LQL on 2017/3/24.
 *
 * 数组元素全排列
 *
 */
public class ArrayAllPermutation {


    public static void dfs(int[] array, int n,int cur,int[] res,boolean[] isVisit){

        if (cur == n){
            for (int i = 0;i < res.length;i++){
                System.out.print(res[i]);
            }
            System.out.println();
        }else {
            for (int i = 0; i < n;i++){
                if (!isVisit[i]){
                    isVisit[i] = true;
                    res[cur] = array[i];
                    dfs(array,n,cur+1,res,isVisit);
                    isVisit[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {1,2,2,3,4,5};
        int[] res = new int[A.length];
        boolean[] isVisit = new boolean[A.length];
       dfs(A,A.length,0,res,isVisit);
    }


}
