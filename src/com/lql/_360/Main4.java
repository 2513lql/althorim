package com.lql._360;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/29.
 */
public class Main4 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        long sum = 1;

        if (N <= 1){
            System.out.println(N);
        }
        else {
            for (int i = 2;i <= N;i++){
                sum = (sum + 3) * 2;
            }
            System.out.println(sum);
        }
    }


}
