package com.lql.offer;

/**
 * Created by zyczyc on 2017/8/12.
 *
 * 递归反转单链表
 */
public class ReverseList {

    public static class Node{
        int val;
        Node next;
    }

    public static Node reverse(Node head){
        return reverseRecursion(null,head);
    }

    public static Node reverseRecursion(Node pre,Node cur){

        if (cur == null){
            return null;
        }
        if (cur.next == null){
            cur.next = pre;
            return cur;
        }
        Node next = cur.next;
        cur.next = pre;
        Node head = reverseRecursion(cur,next);
        return head;
    }


}
