package com.lql.syncollection;

import java.util.*;

/**
 * Created by LQL on 2017/3/11.
 */
public class SynCollection {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(3,1,2));
        Collections.synchronizedCollection(list);
        Object object = new Object();
    }

}
