package com.lql.tree;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/25.
 */
public class Main2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        int left = 0,right = 0;
        for (int i = 0 ; i < chars.length;i++){
            if (chars[i]=='B'){
                left+=i;
                right += chars.length-i-1;
            }
        }

        int resultRight = Integer.MAX_VALUE, resultLeft = Integer.MAX_VALUE;
        if (left > right){
            int index = chars.length - 1;
            resultRight = 0;
            for (int i = chars.length - 1; i >= 0;i--){
                if (chars[i] == 'B'){
                    if (i != index){
                        resultRight += (index - i);
                        index--;
                    }
                }
            }
        }else {
            int index = 0;
            resultLeft = 0;
            for (int i = 0 ; i < chars.length;i++){
                if (chars[i] == 'B'){
                    if (i != index) resultLeft += (i - index);
                    index++;
                }
            }
        }

        System.out.println(Math.min(resultRight,resultLeft));
    }

}
