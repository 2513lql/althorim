package com.lql._360;


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/25.
 */
public class Main {




    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double x[] = new double[n];
        double p[] = new double[n];

        for (int i = 0 ; i < n;i++){
            x[i] = scanner.nextDouble();
            p[i] = scanner.nextDouble();
        }
        double res = 0.0;

        for (int i = 0 ; i < n;i++){
            res += x[i] * (p[i] / 100.0);
        }
        DecimalFormat df = new DecimalFormat("#.000");
        if (0 < res && res < 1){
            System.out.println( "0" + df.format(res));
        }else {
            System.out.println(df.format(res));
        }

    }



}
