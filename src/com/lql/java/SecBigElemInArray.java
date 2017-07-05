package com.lql.java;

/**
 * Created by LQL on 2017/3/23.
 *
 * 找出数组中的第二大数字
 */
public class SecBigElemInArray {


    public static int find2MaxInArray(int[] array){

        if (array == null || array.length <= 1){
            return Integer.MIN_VALUE;
        }
        int max = array[0];
        int second = Integer.MIN_VALUE;
        for (int i = 1; i < array.length;i++){
            if (array[i] > max){
                second = max;
                max = array[i];
            }
            if (array[i] < max && array[i] > second){
                second = array[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] A = {2,1,3,4,5};
        System.out.println(find2MaxInArray(A));
    }



}
