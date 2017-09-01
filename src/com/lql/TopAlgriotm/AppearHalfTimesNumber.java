package com.lql.TopAlgriotm;

/**
 * Created by zyczyc on 2017/8/27.
 *
 * 数组中出现次数超过一半的数字
 */
public class AppearHalfTimesNumber {



    public static int getHalfNumber(int[] array){

        int times = 0;
        int condition = -1;
        for (int i = 0;i < array.length;i++){
            if (times > 0){
                if (array[i] == condition){
                    times++;
                }else {
                    times--;
                }
            }else {
                times = 1;
                condition = array[i];
            }
        }
        if (times > 0){
            return condition;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1,2,1};
        System.out.println(getHalfNumber(A));
    }



}
