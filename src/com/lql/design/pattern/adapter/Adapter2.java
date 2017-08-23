package com.lql.design.pattern.adapter;

/**
 * Created by LQL on 2017/3/19.
 *
 * 对象适配器模式
 * 对象适配器模式采用组合的方式，在适配器类中持有源角色的一个对象，并实现目标角色接口
 * 在接口方法中调用源角色的方法
 *
 */
public class Adapter2 implements Target{

    private Adaptee adaptee;

    public Adapter2(){

    }

    public Adapter2(Adaptee adaptee){
        this.adaptee = adaptee;
    }


    @Override
    public void someThing1() {
        adaptee.someThing1();
    }

    @Override
    public void someThing2() {

    }
}
