package com.lql.offer;

import java.util.Stack;

/**
 * Created by zyczyc on 2017/8/13.
 *
 * 弹栈序列是否是该压栈序列的一个序列
 *
 */
public class PushPopStackSeqence {



    public static boolean isPopSeqenceOfStace(int[] pushSeq,int[] popSeq){

        Stack<Integer> stack = new Stack();

        int k = 0;
        for (int i = 0 ; i < popSeq.length;i++){

            int cur = popSeq[i];
            if (!stack.isEmpty()){
                if (stack.peek() == cur){
                    stack.pop();
                }else if (k < pushSeq.length){
                    for (; k < pushSeq.length; k++) {
                        if (pushSeq[k] != cur) {
                            stack.push(pushSeq[k]);
                        }else {
                            k++;
                            break;
                        }
                    }
                }else {
                    return false;
                }
            }else {
                for (; k < pushSeq.length; k++){
                    if (pushSeq[k] != cur) {
                        stack.push(pushSeq[k]);
                    }else {
                        k++;
                        break;
                    }
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] push = {1,2,3,4,5};
        int[] pop = {1,2,4,5,3};
        System.out.println(isPopSeqenceOfStace(push,pop));
    }


}
