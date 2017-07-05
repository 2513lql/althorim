package com.lql.TopAlgriotm;

/**
 * Created by LQL on 2017/3/23.
 *
 * 数组中找出唯一重复的元素
 */
public class OneDuplicate {


    public static int oneDuplicate(int[] A){

        int res = 0;
        for (int i = 0; i < A.length;i++){
            res ^= A[i];
        }
        for (int i = 1; i < A.length;i++){
            res ^= i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,2,4};
        System.out.println(oneDuplicate(A));
    }


}
