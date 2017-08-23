package com.lql.data.struct;

/**
 * Created by zyczyc on 2017/7/11.
 */
public class Stack {

    private int[] stack;
    private int top;
    int size = 0;
    public Stack(int size){
        stack = new int[size];
        top = 0;
    }

    public boolean isEmpty(){
       if (top == 0){
           return true;
       }
        else {
           return false;
       }
    }

    public boolean push(int i){
        if (top == size) return false;
        stack[top++] = i;
        return true;
    }

    public int pop(){

        if (top == 0){
            return -1;
        }
        else {
            return stack[--top];
        }
    }
}
