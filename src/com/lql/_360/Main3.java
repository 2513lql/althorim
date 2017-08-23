package com.lql._360;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/25.
 */
public class Main3 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int k = 0;
        int begin = 0;
        int end = n - 1;
        int middle;
        for (int i = 0 ;i < m;i++){
            k = sc.nextInt();
            begin = 0;
            end = n - 1;
            middle = (begin + end) / 2;
            if (arr[middle] <= k || arr[middle] - arr[end] == middle - end)
                begin=begin==middle?middle+1:middle;
            else if (arr[middle] > k){
                end = middle;
            }
            if (arr[end] <= k||arr[end] - arr[begin] ==end - begin){
                begin = end;
            }
            System.out.println(arr[begin] +1);
        }

    }
}
