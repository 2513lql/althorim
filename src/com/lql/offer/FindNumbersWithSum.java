package com.lql.offer;

/**
 * Created by LQL on 2017/5/20.
 *
 * 在一个递增数组中查找
 *
 */
public class FindNumbersWithSum {

    public static void findNumbersWithSum(int[] A,int sum){

        if (A == null){
            return;
        }
        if (A.length <= 1){
            return;
        }
        int low = 0,high=A.length - 1;
        while (low < high){

            if (A[low] + A[high] == sum){
                System.out.println(A[low]);
                System.out.println(A[high]);
                low++;
            }

            while (low < high && A[low] + A[high] > sum){
                high--;
            }
            while (low < high && A[low] + A[high] < sum) {
                low++;
            }
        }
    }

    public static void findThreeNumbersWithNumber(int[] A,int sum){

        if (A == null || A.length < 3){
            return;
        }
        int low = 0 ,mid = 0,high = A.length - 1;
        while (low < high){
            mid = low + 1;
            high = A.length - 1;
            int tmp = sum - A[low];
            while (mid < high){

                if (A[mid] + A[high] == tmp){
                    System.out.println(A[low]);
                    System.out.println(A[mid]);
                    System.out.println(A[high]);
                    return;
                }
                while (mid < high && A[mid] + A[high] > tmp){
                    high--;
                }
                while (mid < high && A[mid] + A[high] < tmp){
                    mid++;
                }
            }
            low++;
        }
    }

    public static void main(String[] args) {
        int[] A = {1,2,4,7,11,15};
        findThreeNumbersWithNumber(A,17);
    }

}
