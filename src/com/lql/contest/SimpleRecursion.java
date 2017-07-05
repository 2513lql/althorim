package com.lql.contest;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by LQL on 2017/4/2.
 */
public class SimpleRecursion {

    class Matrix{

        public int m00;
        public int m01;
        public int m10;
        public int m11;

        public Matrix(int m00,int m01,int m10,int m11){
            this.m00 = m00;
            this.m01 = m01;
            this.m10 = m10;
            this.m11 = m11;
        }
    }

    public Matrix mutiple(Matrix matrix1 , Matrix matrix2){
        Matrix matrix = new Matrix(2,3,1,0);
        matrix.m00 = (matrix1.m00 * matrix2.m00 + matrix1.m01*matrix2.m10) % 1000000007;
        matrix.m01 = (matrix1.m00 * matrix2.m01 + matrix1.m01 * matrix2.m11) % 1000000007;
        matrix.m10 = (matrix1.m10 * matrix2.m00 + matrix1.m11 * matrix2.m10) % 1000000007;
        matrix.m11 = (matrix1.m10 * matrix2.m01 + matrix1.m11 * matrix2.m11) % 1000000007;
        return matrix;
    }

    public Matrix martrixPow(int n){
        Matrix matrix = null;
        if (n == 1){
            return new Matrix(2,3,1,0);
        }
        else if ((n & 1) == 0){
            matrix = martrixPow(n / 2);
            matrix = mutiple(matrix,matrix);
        }else if ((n & 1) == 1){
            matrix = martrixPow((n - 1) / 2);
            matrix = mutiple(matrix,matrix);
            matrix = mutiple(matrix,new Matrix(2,3,1,0));
        }
        return matrix;
    }
    public int simpleRec(int n){
        if (n <= 1) return 1;
        Matrix matrix = martrixPow(n - 1);
        return (matrix.m00 * 1 + matrix.m01 * 1) % 1000000007;
    }

    public static void main(String[] args) {
        SimpleRecursion simpleRecursion = new SimpleRecursion();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = simpleRecursion.simpleRec(n);
        System.out.println(res);
    }

}
