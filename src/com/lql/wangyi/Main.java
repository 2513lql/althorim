package com.lql.wangyi;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/12.
 */
public class Main {



    public static int liveDay(String str){

        String[] strings = str.split(" ");
        int x = Integer.parseInt(strings[0]); //每天房租
        int f = Integer.parseInt(strings[1]); //f个水果
        int d = Integer.parseInt(strings[2]); //有d元钱
        int p = Integer.parseInt(strings[3]); //p元/个
        int count = 0;
        for (int i = 0 ; i < f ;i++){
            d = d - x;
            if (d >= 0){
                count++;
            }else {
                break;
            }
        }
        while (d >= 0){
            d = d - p - x;
            if (d >= 0) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(liveDay(str));
    }

}
