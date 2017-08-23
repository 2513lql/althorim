package com.lql.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by zyczyc on 2017/7/2.
 *
 * 贪心解部分背包问题
 *
 * 贪心解背包问题是尽可能将单位价值高的物品放入背包
 *
 */
public class PartBag {

    public static void bag(int sum,Gold[] golds){

        for (int i = 0 ; i < golds.length;i++)
            for (int j = i ; j < golds.length - 1;j++){
                if (golds[j].perValue < golds[j + 1].perValue){
                    Gold tmp = golds[j];
                    golds[j] = golds[j + 1];
                    golds[j + 1] = golds[j];
                }
            }
        for (int i = 0; i < golds.length;i++){

            if (golds[i].weight > sum) break;
            sum -= golds[i].weight;

        }

    }

    static class Gold{
        public int weight;
        public int value;
        public double perValue;
        public Gold(){
        }
        public Gold(int weight,int value){
            this.weight = weight;
            this.value = value;
        }
    }
}
