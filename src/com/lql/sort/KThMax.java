package com.lql.sort;

/**
 * Created by LQL on 2017/1/15.
 */
public class KThMax {

    public static int partition(int[] A,int low , int high){

        int partition = A[low];

        while (low < high){

            while (low < high && A[high] <= partition) high--;
            A[low] = A[high];
            while (low < high && A[low] >= partition) low++;
            A[high] = A[low];
        }
        A[low] = partition;
        return low;
    }

    public static int max_K_Big(int[] A,int low,int high,int k){

        if (low >= high){
            return A[low];
        }else {
            int partition = partition(A,low,high);
            if (partition + 1 == k){
                return A[partition];
            }else if (k < partition + 1){
                return max_K_Big(A,low,partition - 1,k);
            }else {
                return max_K_Big(A,partition + 1,high,k);
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {2,3,4,5,1,6};
        System.out.println(max_K_Big(A,0,5,3));
        for (int i : A){
            System.out.print(i + " ");
        }
    }

}
