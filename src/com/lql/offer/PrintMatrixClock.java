package com.lql.offer;

/**
 * Created by zyczyc on 2017/8/13.
 *
 * 顺时针打印二维数组
 *
 */
public class PrintMatrixClock {


    public static void printMatrix(int[][] matrix){

        if (matrix == null){
            return;
        }




        for (int i = 0,k = matrix.length - 1;i <= k;i++,k--){

            for (int j = i; j <= k; j++){
                System.out.print(matrix[i][j] + " ");
            }

            for (int j = i + 1; j <= k;j++){
                System.out.print(matrix[j][k] + " ");
            }

            for (int j  = k - 1; j >= i;j--){
                System.out.print(matrix[k][j] + " ");
            }
            for (int j = k - 1; j >= i + 1; j--){
                System.out.print(matrix[j][i] + " ");
            }
        }

    }


    public static void main(String[] args) {
        int[][] martrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        printMatrix(martrix);
    }

}
