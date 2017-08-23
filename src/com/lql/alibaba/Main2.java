package com.lql.alibaba;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/26.
 */
public class Main2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String pattern = scanner.nextLine();

        String[] patterns = pattern.split("\\*");

        char[] strChars = str.toCharArray();

        int strIndex = 0;
        int flag = 1;
        for (int i = 0 ; i < patterns.length ;i++){

            char[] curChars = patterns[i].toCharArray();

            for (int j = 0 ; j < curChars.length;j++) {
                if (curChars[strIndex] != curChars[j] && curChars[j] != '?') {
                    flag = 0;
                    break;
                }
                strIndex++;
            }

            for (;strIndex < strChars.length;strIndex++){

            }

            if (flag == 0){
                break;
            }
        }

        System.out.println(flag);
    }


}
