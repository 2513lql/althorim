package com.lql.offer;

import java.util.Stack;

/**
 * Created by LQL on 2017/3/15.
 *
 *
 * 两个栈模拟队列
 *
 */
public class StackToQueue {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        int peek = stack2.pop();

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return peek;
    }




}
