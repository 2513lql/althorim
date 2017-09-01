package com.lql.toutiao;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zyczyc on 2017/9/1.
 */
public class Main {





    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] A = null;
        int n = scanner.nextInt();
        A = new int[n];
        int[] T = new int[101];
        Arrays.fill(T,0);
        for (int i = 0 ; i < n;i++){
            A[i] = scanner.nextInt();
            T[A[i]] = 1;
        }

        int res = 0;
        for (int k = 0 ; k <= 100;k++){

            if (T[k] == 0){
                continue;
            }

            int sum = 0;
            int i = 0;
            while (A[i] < k){
                i++;
            }
            sum = k;
            res = Math.max(res,sum * k);
            for (i = i + 1;i < n;i++){
                if (A[i] < k){
                    sum = 0;
                    continue;
                }
                sum += A[i];
                res = Math.max(res,sum * k);
            }

        }




    }

}
