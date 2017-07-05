package com.lql.tree;

/**
 * Created by LQL on 2017/5/16.
 */
public class BinaryPostTravel {

    public static boolean binaryPostTravel(int[] A,int low,int high){

        if (low >= high){
            return true;
        }
        int priot = A[high];
        int mid = low;
        while (A[mid] < priot&& mid < high){
            mid++;
        }
        int index = mid;
        while (mid < high){
            if (A[mid] < priot){
                return false;
            }
            mid++;
        }

        boolean left = binaryPostTravel(A,low,index - 1);
        boolean right = binaryPostTravel(A,index,high - 1);
        return left & right;
    }

    public static void main(String[] args) {
        int[] A = {7,4,6,5};
        System.out.println(binaryPostTravel(A,0,3));
    }

}
