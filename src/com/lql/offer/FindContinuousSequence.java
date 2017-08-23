package com.lql.offer;

/**
 * Created by LQL on 2017/5/21.
 */
public class FindContinuousSequence {


    public static void findContinuousSeq(int sum){


        int small = 1,big = 2;
        int count = 0;
        int mid = sum / 2;
        while (small <= mid) {
            count = (small + big) * (big - small + 1) / 2;
            if (count == sum) {
                System.out.println(small + "~" + big);
                big++;
            } else if (count < sum) {
                big++;
            } else {
                small++;
            }
        }
    }


    public static void main(String[] args) {
        findContinuousSeq(15);
    }

}
