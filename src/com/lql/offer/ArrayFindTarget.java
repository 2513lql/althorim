package com.lql.offer;

/**
 * Created by LQL on 2017/3/15.
 */
public class ArrayFindTarget {

    public static boolean Find(int target, int [][] array) {


        if (array != null && array.length >0 && array[0].length >0){

            int n = array.length,m = array[0].length;
            int row = 0,col = m - 1;
            while (row < n && col >= 0){
                if (array[row][col] == target) return true;
                else if (array[row][col] > target){
                    col--;
                }else {
                    row++;
                }
            }

        }

        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};
        System.out.println(Find(7,arr));
    }

}
