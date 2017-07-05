package com.lql.TopAlgriotm;

import java.util.Stack;

/**
 * Created by LQL on 2017/5/11.
 *
 * 表达式求解
 *
 */
public class ExpressionCompute {

    public static int solution(String[] expresses){

        int res = 0;
        Stack<Integer> stack = new Stack<>();
        String operators = "+-*/";

        for (int i = 0 ; i < expresses.length;i++){

            String item = expresses[i];
            if (operators.contains(item)){

                int num1 = stack.pop();
                int num2 = stack.pop();
                int tmp = 0;
                switch (item.charAt(0)){
                    case '+': tmp = num1 + num2;break;
                    case '-' : tmp = num2 - num1;break;
                    case '*' : tmp = num1 * num2;break;
                    case '/' : tmp = num2 / num1;break;
                }
                stack.push(tmp);
            }
            else {
                stack.push(Integer.parseInt(item));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] expresses = {"4", "13", "5", "/", "+"};
        System.out.println(solution(expresses));
    }

}
