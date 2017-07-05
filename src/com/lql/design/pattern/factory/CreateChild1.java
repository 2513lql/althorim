package com.lql.design.pattern.factory;

/**
 * Created by LQL on 2017/3/13.
 *
 * 工厂方法模式
 */
public class CreateChild1 implements Factory{

    @Override
    public Father create() {
        return new Child1();
    }

}
