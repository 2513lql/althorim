package com.lql.design.pattern.listener;

/**
 * Created by LQL on 2017/3/19.
 * 抽象观察者角色
 * 抽象观察者角色中定义了，当有主题通知时更新自己的接口
 */
public interface Watcher {


    void update(String str);

}
