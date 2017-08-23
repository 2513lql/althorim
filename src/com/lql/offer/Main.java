package com.lql.offer;

import java.util.Scanner;

/**
 * Created by LQL on 2017/3/19.
 */
public class Main {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int maxQps= Integer.valueOf(in.nextLine());
        final String[] rtList = in.nextLine().split(",");
        final int requestNum = Integer.valueOf(in.nextLine());
        final int threadNum = Integer.valueOf(in.nextLine());
        System.out.println(doneTime(maxQps, rtList, requestNum, threadNum));
    }
    /**
     * 如果使用最优的最大吞吐量负载均衡算法，按照最优模型多久能够处理完所有请求，单位毫秒。
     * @return
     */
    static long doneTime(int maxQps,String[] rtList,int requestNum,int threadNum) {
        //TODO

        long[] rts = new long[rtList.length];
        long allTime = 0L;
        for (int i= 0; i < rtList.length ;i++){
            rts[i] = Long.valueOf(rtList[i]);
        }

        //当线程池中线程大于请求数目时，各个请求可以并行执行，处理请求的时长是最长的RT
        long max = rts[0];
        if (threadNum >= requestNum){
            for (long tmp : rts){
                if (tmp > max){
                    max = tmp;
                }
            }
            allTime = max;
        }
        else { //当线程数小于requestNum时，不足将所有请求并发，

            int count = requestNum / threadNum; //计算请求数是线程数的多少倍
            int leave = requestNum % threadNum; //计算倍数后还剩下
            allTime = max * count;  //
            if(leave != 0){
                allTime += max;
            }
        }
        return allTime;
    }
}
