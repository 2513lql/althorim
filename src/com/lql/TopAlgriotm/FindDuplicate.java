package com.lql.algorithm.sort;

/**
 * Created by Administrator on 2017/3/7.
 */
public class FindDuplicate {


    public static int search(int[] A, int n){
        int sum = 0;

        for (int i = 0; i <= n; i++){
            sum ^= A[i];
        }
        for (int i = 1;i <= n;i++){
            sum ^= A[i];
        }

        return sum;
    }


    public static void main(String[] args) {
        int[] A = new int[1001];
        for (int i = 1;i < 1001;i++){
            A[i] = i;
        }
        A[0] = 899;
        System.out.println(search(A,1000));
    }

}
