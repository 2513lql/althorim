package com.lql.offer;

/**
 * Created by LQL on 2017/5/18.
 *
 * 丑数
 */
public class UglyNumber {

    public static int getUglyNumber(int index){

        if (index <= 0) return -1;
        int[] uglys = new int[index];
        uglys[0] = 1;
        int index2 = 0,index3=0,index5=0;
        for (int i = 1; i < index;i++){
            int min = Math.min(Math.min(uglys[index2] * 2,uglys[index3] * 3),uglys[index5] * 5);
            uglys[i] = min;
            while (uglys[index2] * 2 <= min){
                index2++;
            }
            while (uglys[index3] * 3 <= min){
                index3++;
            }
            while (uglys[index5] * 5 <= min){
                index5++;
            }
        }
        return uglys[index - 1];
    }

    public static void main(String[] args) {
        System.out.println(getUglyNumber(15));
    }
}
