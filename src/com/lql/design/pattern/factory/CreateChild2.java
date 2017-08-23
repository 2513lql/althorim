package com.lql.design.pattern.factory;

/**
 * Created by LQL on 2017/3/13.
 */
public class CreateChild2 implements Factory{
    @Override
    public Father create() {
        return new Child2();
    }

    public static void main(String[] args) {
        Factory factory = new CreateChild1();
        factory.create();
    }
}
