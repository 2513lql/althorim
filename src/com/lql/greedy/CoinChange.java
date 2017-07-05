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
        while (sum > 0){
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
        int N = 7;
        Money[] moneys = new Money[7];
        int[] count = {3,0,2,1,0,3,5};
        int[] money = {1,2,5,10,20,50,100};
        for (int i = 0 ; i < N;i++){
            Money money1 = new Money(count[i],money[i]);
            moneys[i] = money1;
        }

        System.out.println(getMinCount(145,moneys));

    }


}

