package com.lql.greedy;

/**
 * Created by zyczyc on 2017/7/5.
 */
public class RegionCover {


    public static int regionCover(int n,int[] lefts,int[] rights){

        for (int i = 0 ; i < lefts.length - 1;i++)
            for (int j = i ; j < rights.length - i - 1;j++){
                if (lefts[j] > lefts[j + 1]){

                    int tmp = lefts[j];
                    lefts[j] = lefts[j + 1];
                    lefts[j + 1] = tmp;
                    tmp = rights[j];
                    rights[j] = rights[j + 1];
                    rights[j + 1] = tmp;
                }
            }

        int count = 1;
        int left = lefts[0];
        int right = rights[0];
        int i = 1;
        while (right < n){

            int max = i;
            for (; i < rights.length;i++){
                if (lefts[i] <= right){
                    if (rights[i] > rights[max]){
                        max = i;
                    }
                }else {
                    break;
                }
            }
            right = rights[max];
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] lefts = {2,1,3,3,6,2,3};
        int[] rights = {6,4,6,7,8,4,5};
        System.out.println(regionCover(8,lefts,rights));
    }

}
