package com.lql.data.struct;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zyczyc on 2017/7/11.
 */
public class Queue {

    static class Node{
        Integer e;
        Node next;
        public Node(int i){
            this.e = i;
        }
    }
    private Node head = null;
    private Node tail = null;
    public Queue(){
        head = tail = null;
    }

    public boolean isEmpty(){
        if (head == tail && head == null){
            return true;
        }
        return false;
    }

    public void offer(Integer i){
        Node node = new Node(i);
        if (tail == null){
            head = tail = node;
        }
        else {
            tail.next = node;
            tail = node;
        }
    }

    public Node poll(){

        if (isEmpty()){
            return null;
        }
        Node cur = head;
        head = head.next;
        if (head == null){
            tail = null;
        }
        return cur;
    }

}
