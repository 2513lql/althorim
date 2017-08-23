package com.lql.lianjia;

import java.util.Scanner;

/**
 * Created by zyczyc on 2017/8/19.
 */
public class Main {


    public static void func(){

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int[] arr = new int[1001];
        int[] nums = new int[num];

        for (int  i= 0 ; i< num;i++){
            nums[i] = scanner.nextInt();
        }
        int m = num;
        for (int i = 0 ; i < num;i++){
            if (arr[nums[i]] > 0){
                m--;
            }
            arr[nums[i]]++;
        }
        int count = 0;
        for (int i = 0 ; i < arr.length;i++){
            if (arr[i] != 0){
                count++;
                if (count < m){
                    System.out.print(i + " ");
                }else {
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        func();
    }

}
