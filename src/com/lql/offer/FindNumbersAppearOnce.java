package com.lql.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LQL on 2017/5/20.
 *
 * 数组中除了两个数字外其余数字都出现了两次，找出这两个出现一次的数字
 */
public class FindNumbersAppearOnce {


    public static void findAppearOnce(int[] A){
        int res = 0;
        for (int item : A){
            res ^= item;
        }
        int count = 0;
        while ((res & 1) == 0){
            res >>= 1;
            count++;
        }
        int diff = (int)Math.pow(2,count);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int item : A){
            if ((item & diff) == 0){
                list1.add(item);
            }else {
                list2.add(item);
            }
        }
        int num1 = 0,num2 = 0;
        for (Integer item : list1){
            num1 ^= item;
        }
        for (Integer item : list2){
            num2 ^= item;
        }
        System.out.println(num1);
        System.out.println(num2);
    }


    public static void main(String[] args) {
        int[] A = {2,4,3,6,3,2,5,5};
        findAppearOnce(A);
    }

}
