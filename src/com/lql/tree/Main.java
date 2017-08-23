package com.lql.tree;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/25.
 */
public class Main {


    public static void main(String[] args) {
        int[] x = new int[60];
        int[] y = new int[60];
        int minCost = Integer.MAX_VALUE;
        int gx , gy;
        int walkTime , taxiTime;
        int i,n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (i = 0 ; i < n;i++){
            x[i] = scanner.nextInt();
        }
        for (i = 0; i < n;i++){
            y[i] = scanner.nextInt();
        }
        gx = scanner.nextInt();
        gy = scanner.nextInt();
        walkTime = scanner.nextInt();
        taxiTime = scanner.nextInt();
        if ((Math.abs((gx)) + Math.abs(gy)) * walkTime < minCost){ // 直接走路去公司
            minCost = (Math.abs(gx) + Math.abs(gy)) * walkTime;
        }
        for (i = 0 ; i < n ;i++){
            int totalCost = (Math.abs(x[i]) + Math.abs(y[i])) * walkTime + (Math.abs(gx - x[i]) + Math.abs(gy - y[i])) * taxiTime;
            if (totalCost < minCost){
                minCost = totalCost;
            }
        }

        System.out.println(minCost);
    }

}
