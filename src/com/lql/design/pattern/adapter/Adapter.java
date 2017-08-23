package com.lql.design.pattern.adapter;

/**
 * Created by LQL on 2017/3/19.
 *
 * 适配器角色
 * 类适配器模式，类适配器继承源角色类，这样类适配器就拥有了源角色的方法
 * 适配器角色是适配器模式的核心，将源接口转换为目标接口
 * 并最终由适配器角色向客户端提供所需接口服务
 */
public class Adapter extends Adaptee implements Target{



    @Override
    public void someThing2() {
    }


}
