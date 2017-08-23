package com.lql.tree;

import java.util.Arrays;

/**
 * Created by LQL on 2017/5/16.'
 *
 * 数组中三个数和为目标数字的组合
 */
public class ArraySum {


    public static int[] getTarget(int[] A,int target){

        Arrays.sort(A);

        int low = 0 , high = A.length;
        int[] res = new int[3];
        for (;low < high;low++){
            int tmp = target - A[low];
            high = A.length - 1;
            for (int i = low + 1; i < high;){
                if (A[i] + A[high] == tmp){
                    res[0] = A[low];
                    res[1] = A[i];
                    res[2] = A[high];
                    return res;
                }
                else if (A[i] + A[high] > tmp){
                    high--;
                }else {
                    i++;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] A = {2,3,4,5,6,10};
        int[] res = getTarget(A,12);
        for (int i = 0 ; i < res.length;i++){
            System.out.println(res[i]);
        }
    }

}
