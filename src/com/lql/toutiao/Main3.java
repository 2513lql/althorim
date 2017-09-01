package com.lql.toutiao;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Administrator on 2017/3/30.
 */
public class Main3 {





    public static void printGraph(String str){

        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (int i = 0 ; i < chars.length;i++){
            if (chars[i] == '['){
                stack.push(chars[i]);
            }
            else {

            }

        }
    }

    public static void printLine(int size){
        System.out.print("+");
        for (int i = 0 ; i < size * 2 - 1;i++){
            System.out.print("-");
        }
        System.out.println("-");
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();


    }

}
