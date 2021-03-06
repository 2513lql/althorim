package com.lql.offer;

/**
 * Created by LQL on 2017/5/21.
 *
 * n个骰子，打印所有点数之和的概率
 */
public class PrintProbability {


    public static int maxValue = 6;

    public static void printProbability(int number){


        int[][] probability = new int[2][number * maxValue + 1];

        for (int i = 0;i < number * maxValue + 1;i++){
            probability[0][i] = 0;
            probability[1][i] = 0;
        }
        int flag = 0;
        for (int i = 1 ; i <= maxValue;i++){
            probability[flag][i] = 1;
        }
        for (int k = 2;k <= number;k++){
            for (int i = k; i <= k * maxValue;i++){

                probability[1 - flag][i] = 0;
                for (int j = 1;j <= maxValue && j <= i;j++){
                    probability[1 - flag][i] += probability[flag][i - j];
                }
            }
            flag = 1 - flag;





















































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































        }
        double total =Math.pow(maxValue,number);
        double sum = 0;
        for (int i = number;i <= number * maxValue;i++){
            double ratio = probability[flag][i] * 1.0 / total;
            System.out.println(i + " : " + ratio);
            sum += ratio;
        }
    }


    public static void main(String[] args) {
        printProbability(3);
    }

}
