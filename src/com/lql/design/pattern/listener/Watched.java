package com.lql.design.pattern.listener;

/**
 * Created by LQL on 2017/3/19.
 *
 * 抽象主题角色
 * 抽象主题角色中提供了增加，删除监听者对象的接口
 */
public interface Watched {

    void addWatcher(Watcher watcher);
    void removeWatcher(Watcher watcher);
    void notifyWatchers(String str);
}
