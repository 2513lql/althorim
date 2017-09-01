package com.lql.sort;

/**
 * Created by LQL on 2017/3/2.
 */
public class KThMax2 {



    public static int KTHMax(int[] A,int k,int low,int high){

        if (low >= high){
            return A[low];
        }else{
            int partition = partition(A,low,high);
            if (partition == k - 1) return A[partition];
            else if (partition < k - 1){
                return KTHMax(A,k,partition + 1,high);
            }else {
                return KTHMax(A,k,low,partition - 1);
            }
        }
    }


    public static int partition(int[] A,int low,int high){
        int prot = A[low];
        while (low < high){
            while (low < high && prot >= A[high]) high--;
            A[low] = A[high];
            while (low < high && prot <= A[low]) low++;
            A[high] = A[low];
        }
        A[low] = prot;
        return low;
    }


    public static void main(String[] args) {
        int[] A = {2,3,4,5,1,6};
        System.out.println(KTHMax(A,7,0,5));
    }


}
