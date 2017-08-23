package com.lql.design.pattern.factory;

/**
 * Created by LQL on 2017/3/13.
 */
public class SimpleFactory {


    public static Father createInstance(String name){
        if ("child1".equals(name)){
            return new Child1();
        }else if ("child2".equals(name)){
            return new Child2();
        }else {
            return null;
        }
    }
    public static void main(String[] args) {
        Father child1 = createInstance("child1");
        Father child2 = createInstance("child2");
    }
}
