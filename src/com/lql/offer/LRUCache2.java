package com.lql.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zyczyc on 2017/8/27.
 *
 *
 */
public class LRUCache2 {


    public static class CacheNode{

        public int val;
        public CacheNode pre;
        public CacheNode next;

        public CacheNode(int val){
            this.val = val;
        }

        public CacheNode(){

        }
    }

    public Map<Integer,CacheNode> cache = new HashMap<>();
    public CacheNode head,tail;
    public int capacity;
    public int size = 0;
    public LRUCache2(int capacity){
        this.capacity = capacity;
        this.size = 0;
    }

    public CacheNode removeNode(CacheNode node){
        if (node == null){
            throw new NullPointerException();
        }
        if (node == tail && node == head){
            tail = head = null;
        }
        else if (node == tail){
            tail = node.pre;
            node.pre = null;
            tail.next = null;
        }else if (node == head){
            head = node.next;
            node.next = null;
            head.pre = null;
        }else {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
        return node;
    }


    public void setHead(CacheNode node){

        node.next = head;
        node.pre = null;
        if (head.pre != null){
            head.pre = node;
        }
        head = node;
        if (tail == null){
            tail = node;
        }

    }

    public CacheNode get(int key){

        if (!cache.containsKey(key)){
            return null;
        }
        CacheNode node = cache.get(key);
        removeNode(node);
        setHead(node);
        return node;
    }

    public boolean set(int key){

        if (cache.containsKey(key)){
            CacheNode node = cache.get(key);
            removeNode(node);
            setHead(node);
            return true;
        }else {
            CacheNode node = new CacheNode(key);
            cache.put(key,node);
            if (size >= capacity){
                removeNode(tail);
                setHead(node);
            }else {
                setHead(node);
                size++;
            }
            return true;
        }

    }

}

