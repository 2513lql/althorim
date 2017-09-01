package com.lql.JD;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/7.
 */
public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        int n = Integer.parseInt(tmp);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        int res = 0;
        for (int i = 0 ; i < n;i++){
            int cur1 = (str1.charAt(i) - '0');
            int cur2 = (str2.charAt(i) - '0');

            int cur = cur1 ^ cur2;
            if (cur == 1)
            res += Math.pow(2,n - 1 - i);
        }

        System.out.println(res);
    }


}
