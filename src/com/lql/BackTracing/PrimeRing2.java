package com.lql.BackTracing;

/**
 * Created by LQL on 2017/3/6.
 */
public class PrimeRing2 {

    public static void primeRing(int cur,int[] res,int n,boolean[] isPrime,boolean[] isVisit){
        if (cur == n && isPrime[res[cur - 1] + res[0]] == true){
            for (int j= 0;j < n;j++){
                System.out.print(res[j] + " ");
            }
        }else {
            for (int i = 2;i <= n;i++){
                if (isVisit[i] == false && isPrime[res[cur - 1] + i]){
                    isVisit[i] = true;
                    res[cur] = i;
                    primeRing(cur + 1 , res , n ,isPrime,isVisit);
                    isVisit[i] = false;
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
        boolean[] isPrime = isPrime(20);
        for (int i = 0 ; i < isPrime.length;i++){
            System.out.print(i + ":" + isPrime[i] + "  ");
        }
        boolean[] isVisited = new boolean[20];
        for (int i = 0 ; i < isVisited.length;i++){
            isVisited[i] = false;
        }
        int[] res = new int[6];
        res[0] = 1;
        isVisited[1] = true;
        primeRing(1,res,6,isPrime,isVisited);

    }


}
