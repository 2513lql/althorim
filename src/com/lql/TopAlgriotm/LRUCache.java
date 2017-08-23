package com.lql.TopAlgriotm;

import java.util.HashMap;
import java.util.jar.Pack200;

/**
 * Created by zyczyc on 2017/7/5.
 *
 * 利用双向链表和HashMap实现LRUCache
 *
 */
public class LRUCache {

    static class CacheNode{
        public CacheNode next;
        public CacheNode pre;
        public Object value;
        public int key;
    }

    public int cacheSize;
    public int curSize;
    public HashMap<Integer,CacheNode> hashMap;
    public CacheNode tail,head;


    public LRUCache(int size){
        tail = head = null;
        this.cacheSize = size;
        curSize = 0;
        hashMap = new HashMap<>();
    }


    public CacheNode get(int key){

        if (curSize == 0){
            return null;
        }
        if (hashMap.get(key) == null) {
            return null;
        }
        CacheNode cur = hashMap.get(key);
        reset(cur);
        return cur;
    }

    public void reset(CacheNode cur){

        if (curSize > 1 && head != cur){
            if (cur.pre != null){
                cur.pre.next = cur.next;
            }
            cur.next.pre = cur.pre;
            head.next = cur;
            cur.pre = head;
        }
    }

    public void set(CacheNode node){
        if (cacheSize == 0) return;
        CacheNode cur = hashMap.get(node.key);
        if (cur != null){
            reset(cur);
            return;
        }
        if (curSize == cacheSize){
            remove();
        }
        head.next = node;
        node.pre = head;
        hashMap.put(node.key,node);
        head = node;
    }

    public void remove(){
        if (cacheSize == 1){
            hashMap.remove(tail.key);
            tail = null;
            head = null;
        }else {
            hashMap.remove(tail.key);
            tail.next.pre = null;
            tail = tail.next;
        }

    }
}
