package com.lql.java;

/**
 * Created by LQL on 2017/3/24.
 * 数组两个元素的差值都是1，求给定元素在数组中第一次出现的位置
 */
public class ElemInArrayIndex {


    public static int indexInArray(int[] A,int a){

        for (int i = 0 ; i < A.length;){

            if (A[i] == a){
                return i;
            }
            else {
                i += Math.abs(a - A[i]);
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] A = {3,4,5,6,5,6,7,8};

        System.out.println(indexInArray(A,5));
    }


}
