package com.lql.design.pattern.listener;

/**
 * Created by LQL on 2017/3/19.
 *
 * 具体观察者
 * 实现抽象观察者接口
 */
public class ConcreteWatcher implements Watcher{


    @Override
    public void update(String str) {
        System.out.println("观察者被通知更新---->" + str);
    }
}
