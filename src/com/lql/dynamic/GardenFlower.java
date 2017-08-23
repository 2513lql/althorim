package com.lql.dynamic;

/**
 * Created by LQL on 2017/3/2.
 */
public class GardenFlower {


    public static int[] getOrdering(int[] height, int[] bloom, int[] wilt){

        for (int i = 0 ; i < height.length - 1;i++){
            for (int j = 0; j < height.length - i - 1;j++){
                if (height[j] > height[j + 1]){
                    swap(height,bloom,wilt,j,j + 1);
                }
            }
        }

        for (int i = 0 ; i < height.length;i++){
            for (int j = i + 1; j < height.length;){

                if (bloom[i] > wilt[j]){
                    j++;
                }else {

                }

            }

        }


        return height;
    }

    public static void swap(int[] height, int[] bloom, int[] wilt,int i,int j){
        swap(height,i,j);
        swap(bloom,i,j);
        swap(wilt,i,j);
    }

    public static void swap(int[] tmp,int i,int j){
        tmp[i] ^= tmp[j];
        tmp[j] ^= tmp[i];
        tmp[i] ^= tmp[j];
    }


    public static void main(String[] args) {
        int[] height = {5,4,3,2,1};
        int[] bloom = {1,5,10,15,20};
        int[] wilt = {5,10,14,20,25};
         getOrdering(height,bloom,wilt);
        for (int i : height){
            System.out.println(i);
        }
    }


}
