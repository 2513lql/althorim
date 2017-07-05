package com.lql.offer;

/**
 * Created by LQL on 2017/4/18.
 *
 * 数组中超过一半的数字
 *
 */
public class MoreThanHalfNum {


    public static int num = -1;
    public static void moreThanHalfNum(int[] A,int low,int high){
        if (low < high){
            int part = gePartion(A,low,high);
            if (part == A.length / 2) {
                num = A[part];
                return ;}
            if (part < A.length / 2)  moreThanHalfNum(A,part + 1,high);
            if (part > A.length / 2) moreThanHalfNum(A,low,part - 1);
        }
    }

    private static int gePartion(int[] A, int low, int high) {
        int part = A[low];
        while (low < high){

            while (part <= A[high] && low < high) high--;
            A[low] = A[high];
            while (A[low] < part && low < high) low++;
            A[high] = A[low];
        }
        A[low] = part;
        return low;
    }


    public static int getMoreThanHalf(int[] A){
        int times = 0;
        int candidate = -1;
        for (int i = 0; i < A.length;i++){

            if (times == 0){
                candidate = A[i];
            }
            if (candidate == A[i]){
                times++;
            }else {
                times--;
            }
        }
        return candidate;

    }

    public static void main(String[] args) {
        int[] A = {1,2,3,2,2,2,5,4,2};
//        moreThanHalfNum(A,0,8);
        int res = getMoreThanHalf(A);
        System.out.println(res);
//        System.out.println(num);
    }

}
