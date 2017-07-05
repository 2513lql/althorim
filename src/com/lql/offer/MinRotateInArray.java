package com.lql.offer;

/**
 * Created by LQL on 2017/3/15.
 */
public class MinRotateInArray {

    public static int minNumberInRotateArray(int [] array) {

        if (array.length == 0) return 0;
        int min = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] < array[i - 1]){
                return array[i];
            }
        }
        return array[0];
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3};
        System.out.println(minNumberInRotateArray(arr));
    }

}
