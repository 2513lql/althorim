package com.lql;

import sun.misc.Unsafe;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zyczyc on 2017/8/19.
 */
public class Collection {





    public static void main(String[] args) {


        LinkedList list = new LinkedList();
//
//        Vector vector = new Stack();
//        HashMap<String,String> map = new HashMap<>();
//        Collections.synchronizedList(new ArrayList<>());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

        HashMap<String,String> map = new HashMap<>();
        map.put("A","hello");
        map.put("A","world");
        System.out.println(map.get("A"));
        Hashtable<String,String> table = new Hashtable<>();

    }


}
