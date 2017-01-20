package com.lql.dynamic;

/**
 * Created by LQL on 2016/10/31.
 */
public class FlowerGarden {

    public static int[] getOrdering(int[] height,int[] bloom,int wilt[]){
        int tmp;
        for (int i = 1 ; i < height.length;i++){
            for (int j = 0 ; j < i ; j++){
                if (wilt[j] >= bloom[i]){
                    if (height[j] > height[i]){
                        tmp = height[j];
                        height[j] = height[i];
                        height[i] = tmp;
                        tmp = bloom[j];
                        bloom[j] = bloom[i];
                        bloom[i] = tmp;
                        tmp = wilt[j];
                        wilt[j] = wilt[i];
                        wilt[i] = tmp;
                    }
                }else{
                    if (height[i] > height[j]){
                        tmp = height[j];
                        height[j] = height[i];
                        height[i] = tmp;
                        tmp = bloom[j];
                        bloom[j] = bloom[i];
                        bloom[i] = tmp;
                        tmp = wilt[j];
                        wilt[j] = wilt[i];
                        wilt[i] = tmp;
                    }
                }
            }
        }
        return height;
    }

    public static void main(String[] args) {
        int[] height = {5,4,3,2,1};
        int[] bloom = {1,5,10,15,20};
        int[] wilt = {5,10,14,20,25};
        int[] height2 = {1,2,3,4,5,6};
        int[] bloom2 = {1,3,1,3,1,3};
        int[] wilt2 = {2,4,2,4,2,4};

        int[] result = getOrdering(height2,bloom2,wilt2);
        for (int i = 0 ; i < result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}



