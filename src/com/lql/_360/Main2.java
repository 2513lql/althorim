package com.lql._360;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/25.
 */
public class Main2 {


    public static int isEvenStr(String str){ //判断子串是不是偶串
        int res = 0;
        for (int i = 0; i < str.length();i++){ //通过异或的方法判断是否所有字符都是偶数个
            res ^= str.charAt(i);
        }
       return res == 0 ? 1 : 0;
    }

    public static int getEvenCount(String string){

        int count = 0;

        for (int i = 1 ; i < string.length();i++){
            for (int j = 0; j <= string.length() - i; j++){
                String sub = string.substring(j,j + i);
                if ((sub.length() & 1) == 0){
                    count += isEvenStr(sub);
                }
            }
        }
        count += isEvenStr(string);
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(getEvenCount(str));
    }




}
