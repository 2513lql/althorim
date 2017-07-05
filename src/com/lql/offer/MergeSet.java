package com.lql.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by LQL on 2017/5/7.
 */
public class MergeSet {


    public static Set<Integer> getMerge(int[] A,int[] B){

        int i = 0,j = 0;
        Set<Integer> set = new HashSet<>();
        while (i < A.length&&j < B.length){

            while (i<A.length&&j < B.length&&A[i] == B[j]){
                set.add(A[i]);
                i++;
                j++;
            }
            while (i<A.length&&j < B.length&&A[i] < B[j]){
                i++;
            }
            while (i<A.length&&j < B.length&&A[i] > B[j]){
                j++;
            }
        }
        return set;
    }

    public static void main(String[] args) {
        int[] A = {0,1,2,3,5};
        int[] B = {1,3,5,7,9};
        Set<Integer> set = getMerge(A,B);
        for (Integer integer : set){
            System.out.println(integer);
        }
    }

}
