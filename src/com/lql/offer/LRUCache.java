package com.lql.offer;

import com.lql.wangyi.Parent;
import sun.security.krb5.internal.PAForUserEnc;
import sun.security.validator.Validator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LQL on 2017/5/7.
 */
public class LRUCache {

    class Node{
        public int key;
        public int value;
        public Node pre;
        public Node next;

        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
        public Node(){

        }
    }

    private Map<Integer,Node> cache = new HashMap<>();
    private int size=0;
    private int capacity;
    private Node head = null;
    private Node tail = null;
    public LRUCache(int capacity){
        this.capacity = capacity;
    }

    private void removeNode(Node node){
        Node pre = node.pre;
        Node next = node.next;
        if (pre != null){
            pre.next = next;
        }else {
            head = next;
        }
        if (next != null){
            next.pre = pre;
        }else {
            tail = pre;
        }
    }

    private void setHead(Node node){
        node.next = head;
        node.pre = null;
        if (head != null){
            head.pre = node;
        }
        head = node;
        if (tail == null){
            tail = node;
        }
    }

    public void set(int key,int value){
        if (cache.containsKey(key)){
            Node node = cache.get(key);
            removeNode(node);
            setHead(node);
            return;
        }
        Node node = new Node(key,value);
        cache.put(key,node);
        if (size < capacity) {
            size++;
            setHead(node);
        }else {
            Node pre = tail.pre;
            tail = pre;
            if (pre != null){
                pre.next = null;
            }else {
                head = null;
            }
            setHead(node);
        }
    }

    public int get(int key){
        if (!cache.containsKey(key)){
            return -1;
        }else {
            Node node = cache.get(key);
            removeNode(node);
            setHead(node);
            return node.value;
        }
    }

}
