package com.lql.TopAlgriotm;

/**
 * Created by LQL on 2017/3/23.
 */
public class RecursionMax {

    public static int maxInArray(int[] arr,int begin){

        int length = arr.length - begin;
        if (length == 1){
            return arr[begin];
        }
        else {
            return Math.max(arr[begin],maxInArray(arr,begin + 1));
        }
    }

    public static void main(String[] args) {
        int[] A = {2,3,1,5,4};
    }

}
