package com.lql;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/25.
 */
public class MoLi {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i< n1;i++){
            arr[i] = scanner.nextInt();
        }

        moli(arr,n2);
        for (int i = 0 ; i < arr.length;i++){
            if (i < arr.length - 1)
                System.out.print(arr[i] + " ");
            else {
                System.out.println(arr[i]);
            }
        }
    }

    public static void moli(int[] arr,int k){

        int[] tmp = new int[arr.length];
        for (int i = 0;i < k;i++){
            for (int j = 0 ; j < arr.length;j++){
                tmp[j] = (arr[j] + arr[(j + 1) % arr.length]) % 100;
            }
            for (int l = 0; l < arr.length;l++){
                arr[l] = tmp[l];
            }
        }
    }







}
