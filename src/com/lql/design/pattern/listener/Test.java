package com.lql.design.pattern.listener;

/**
 * Created by LQL on 2017/3/19.
 */
public class Test {

    public static void main(String[] args) {
        Watched watched = new ConcreteWatched();
        Watcher watcher = new ConcreteWatcher();
        Watcher watcher1 = new ConcreteWatcher();
        watched.addWatcher(watcher);
        watched.addWatcher(watcher1);
        watched.notifyWatchers("hello world");
    }
}
