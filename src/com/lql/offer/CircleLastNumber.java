package com.lql.offer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by LQL on 2017/5/21.
 *
 * 圆圈中最后一个数字
 */
public class CircleLastNumber {


    /*链表中最后一个数*/
    public static int getLastInCircle(int[] A,int k){

        List<Integer> list = new LinkedList<>();
        for (int item : A){
            list.add(item);
        }
        int index = 0;
        while (list.size() > 1){
            int count = 1;
            while (count != k){
                index += 1;
                index %= list.size();
                count++;
                System.out.println("----" + index);
            }
            list.remove(index);
            if (index >= list.size()) index = 0;
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        int[] A = {0,1,2,3,4};
        System.out.println(getLastInCircle(A,3));
    }

}
