package com.lql.offer;

/**
 * Created by LQL on 2017/3/27.
 *
 *
 * 素数筛选
 *
 */
public class SuShu {


    public static int sushuShaixuan(int n){

        boolean[] flag = new boolean[n + 1];
        int[] prime = new int[n];

        int count = 0;
        for (int i = 2 ; i <= n;i++){

            if (!flag[i])
                prime[count++] = i;
            for (int j = 0 ; j < count && i * prime[j] <= n;j++){
                flag[i * prime[j]] = true;
                if (i % prime[j] == 0) break;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(sushuShaixuan(20));
    }

}
