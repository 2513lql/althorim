package com.lql.toutiao;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/30.
 */
public class Main4 {




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int []A = new int[n];
        int []B = new int[n];
        for (int i = 0 ; i < n;i++){
            A[i] = scanner.nextInt();
        }
        for (int i = 0 ; i  < n ;i++){
            B[i] = scanner.nextInt();
        }
        int[][] martrix = new int[q][2];
        for (int i = 0; i < q;i++){
            martrix[i][0] = scanner.nextInt();
            martrix[i][1] = scanner.nextInt();
        }
        for (int i = 0 ; i < q;i++){
            int count = 0;
            for (int  j = 0 ; j < n;j++){
                if (A[j] >= martrix[i][0] && B[j] >= martrix[i][1]){
                    count++;
                }
            }
            System.out.println(count);
        }

    }

}
