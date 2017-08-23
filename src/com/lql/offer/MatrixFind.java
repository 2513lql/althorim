package com.lql.offer;

/**
 * Created by zyczyc on 2017/8/12.
 *
 * 二维数组查找
 */
public class MatrixFind {



    public static boolean find(int[][] matrix,int k){

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0){

            if (matrix[row][col] == k){
                return true;
            }else if(matrix[row][col] > k){
                col--;
            }else {
                row++;
            }
        }
        return false;
    }




    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,8,9},
                {2,4,6,8},
                {4,7,10,13},
                {6,8,11,15}
        };
        System.out.println(find(matrix,7));

        String str = "123456";
        char[] chars = str.toCharArray();
        char c = chars[0];
        int i = 0;
        while (c != '\0'){
            c = chars[++i];
            System.out.println(c);
        }
    }


}
