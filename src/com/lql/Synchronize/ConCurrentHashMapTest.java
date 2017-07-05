package com.lql.Synchronize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by LQL on 2017/3/24.
 */
public class ConCurrentHashMapTest {

    public static void main(String[] args) {
        Collections.synchronizedList(new ArrayList<>());
        ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();
    }


}
