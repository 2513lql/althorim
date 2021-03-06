package com.lql;

import java.util.*;

/**
 * Created by LQL on 2017/4/2.
 */
public class Main {

    class Matrix{

        public long m00;
        public long m01;
        public long m10;
        public long m11;

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

    public Matrix martrixPow(long n){
        Matrix matrix = null;
        if (n == 1){
            return new Matrix(2,3,1,0);
        }
        else if ((n & 1) == 0){
            matrix = martrixPow(n >> 1);
            matrix = mutiple(matrix,matrix);
        }else if ((n & 1) == 1){
            matrix = martrixPow((n - 1) >> 1);
            matrix = mutiple(matrix,matrix);
            matrix = mutiple(matrix,new Matrix(2,3,1,0));
        }
        return matrix;
    }
    public long simpleRec(long n){
        if (n <= 1) return 1;
        Matrix matrix = martrixPow(n - 1);
        return (matrix.m00 * 1 + matrix.m01 * 1) % 1000000007;
    }

    public static void main(String[] args) {
//        Main simpleRecursion = new Main();
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        long n = Long.parseLong(s);
//        long res = simpleRecursion.simpleRec(n);
//        System.out.println(res);
        String[] arrays = {"",""};
        Arrays.sort(arrays, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });


    }

}
