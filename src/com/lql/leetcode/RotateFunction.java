package com.lql.leetcode;

/**
 * Created by LQL on 2016/11/9.
 */
public class RotateFunction {

    public static int maxRotateFunction(int[] A) {
        int max = 0;
        for (int i = 0;i < A.length;i++){
            max += i * A[i];
        }


        for (int i = 1 ; i < A.length;i++){
            int tmp = 0;
            for (int j = 0 ; j < A.length;j++){
               if (j < i){
                   tmp += A[A.length - i + j] * j;
               }else{
                   int index = j - i;
                   tmp += A[index] * j;
               }
            }
            if (tmp > max){
                max = tmp;
            }
            System.out.println(tmp);
        }
        return max;

    }

    public static void main(String[] args) {
        int[] A = {4,3,2,6};
        System.out.println(maxRotateFunction(A));
    }

}
