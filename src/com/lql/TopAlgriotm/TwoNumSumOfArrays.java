package com.lql.TopAlgriotm;

/**
 * Created by Administrator on 2017/3/8.
 */
public class TwoNumSumOfArrays {



    public static void find(int[] arr,int sum){

        int begin = 0,end = arr.length - 1;
        int curSum = arr[begin] + arr[end];
        while (begin < end){
            if (curSum == sum) {
                System.out.println("begin:" + begin);
                System.out.println("end:" + end);
            }else if (curSum > sum){
                end--;
            }else
            {
                begin++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,7,11,13,15};
        find(arr,15);
    }

}
