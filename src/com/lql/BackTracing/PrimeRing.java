package com.lql.BackTracing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LQL on 2016/12/2.
 */
public class PrimeRing {


    public static void dfs(int cur , int n, List<String> list, int[] res, boolean isPrime[], boolean isVisited[]){
        if (cur == n && isPrime[res[cur - 1] + res[0]]){
            StringBuffer buffer = new StringBuffer();
            for (int i = 0 ; i < n;i++){
                buffer.append(res[i]+" ");
            }
            list.add(buffer.toString());
        }
        else{
            for (int i = 2;i <= n ;i++){
                if (!isVisited[i] && isPrime[res[cur - 1] + i]){
                    isVisited[i] = true;
                    res[cur] = i;
                    dfs(cur+ 1,n,list,res,isPrime,isVisited);
                    isVisited[i] = false;
                }
            }
        }
    }

    public static void dfs2(int cur,int n,int[] res,boolean[] isPrime,boolean[] isVisited){

        if (cur == n && isPrime[res[0] + res[n - 1]]){
            for (int i = 0 ; i < n;i++){
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }else{

            for (int i = 2;i <= n ; i++){

                if (isVisited[i] && isPrime[res[cur - 1] + i]){
                    isVisited[i] = true;
                    res[cur] = i;
                    dfs2(cur + 1,n , res , isPrime ,isVisited);
                    isVisited[i] = false;
                }
            }
        }

    }

    public static boolean[] isPrime(int n){
        boolean[] isPrime = new boolean[n + 1];
        int[] prime = new int[n / 2 + 1];
        for (int i = 2 ; i < isPrime.length;i++){
            isPrime[i] = true;
        }
        int count = 0;
        for (int i = 2;i <=n ; i++){
            if (isPrime[i]){
                prime[count++] = i;
            }
            for (int j = 0 ;j <count;j++){
                if (i * prime[j] <= n){
                    isPrime[i * prime[j]] = false;
                    if (i % prime[j] == 0) break;
                }
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        boolean[] isPrime = isPrime(40);
//        for (int i = 0 ; i < isPrime.length;i++){
//            if (isPrime[i]){
//                System.out.print(i + " ");
//            }
//        }
        boolean[] isVisited = new boolean[20];
        int[] res = new int[20];
        res[0] = 1;

        dfs(1,10,list,res,isPrime,isVisited);
        for (String s : list){
            System.out.println(s);
        }
    }

}
