package com.lql.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by zyczyc on 2017/7/2.
 *
 * 贪心解钱币找零问题
 *
 * 有各种面额的纸币,每种纸币数量若干，用最少的数量支付K元
 */
public class CoinChange {

    public static int getMinCount(int sum,Money[] moneys){
        Arrays.sort(moneys, new Comparator<Money>() {
            @Override
            public int compare(Money o1, Money o2) {
                return o2.money - o1.money;
            }
        });
        int i = 0;
        int count = 0;
        while (sum > 0 && i < moneys.length){
            if (moneys[i].count * moneys[i].money <= sum){
                count+= moneys[i].count;
                sum -= moneys[i].count * moneys[i].money;
            }else {
                int tmp = sum / moneys[i].money;
                count += tmp;
                sum -= tmp * moneys[i].money;
            }
            i++;
        }
        if (sum > 0) return -1;
        return count;
    }

    static class  Money{

        public int money;
        public int count;
        public Money(){

        }
        public Money(int count,int money){
            this.count = count;
            this.money = money;
        }

    }


    public static void main(String[] args) {
        int N = 5;
        Money[] moneys = new Money[5];
        int[] count = {5,5,5,6,5};
        int[] money = {1,2,5,9,10};
        for (int i = 0 ; i < N;i++){
            Money money1 = new Money(count[i],money[i]);
            moneys[i] = money1;
        }

        System.out.println(getMinCount(18,moneys));

    }


}

