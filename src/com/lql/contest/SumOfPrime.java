package com.lql.contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by LQL on 2017/4/2.
 */
public class SumOfPrime {



    public static void dfs(List<Integer> prime,int n,int curSum,int cur,boolean[] isVisit,int[] res,int index){

        if (curSum == n){
            res[index]++;
        }
        else {
            for (int i = cur; i < prime.size();i++){
                if (!isVisit[i]){
                    isVisit[i] = true;
                    dfs(prime,n,curSum + prime.get(i),cur,isVisit,res,index);
                    isVisit[i] = false;
                }
            }
        }


    }

    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> integers = new ArrayList<>();
//        do {
//
//            String line = scanner.nextLine();
//            if (line.equals("")){
//                break;
//            }
//            integers.add(Integer.parseInt(line));
//        }while (true);
//        int[] res = new int[integers.size()];

    }

    public static List getPrime(int n){


        int[] primes = new int[n + 1];
        ArrayList<Integer> arrayList = new ArrayList<>();
        boolean[] notPrimes = new boolean[n + 1];
        int count = 0;
        for (int i = 2; i <= n;i++){
            if (!notPrimes[i]){
                arrayList.add(i);
                count++;
            }
            for (int j = 0 ; j < count && arrayList.get(j) * i <= n;j++){
                notPrimes[arrayList.get(j) * i] = true;
                if (i % arrayList.get(j) == 0)
                    break;
            }
        }
        return arrayList;
    }



}
