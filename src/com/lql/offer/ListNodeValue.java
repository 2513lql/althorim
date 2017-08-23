package com.lql.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by LQL on 2017/3/15.
 */
public class ListNodeValue {

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while (listNode != null){
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }



    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


    public static void main(String[] args) {
        ListNodeValue listNodeValue = new ListNodeValue();

        ListNode listNode = listNodeValue.new ListNode(1);
        ListNode listNode1 = listNodeValue.new ListNode(2);
        listNode.next = listNode1;
        ListNode listNode2 = listNodeValue.new ListNode(3);
        listNode1.next = listNode2;

        ArrayList<Integer> arrayList =printListFromTailToHead(listNode);
        for (int i = 0 ; i < arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }




}
