package com.lql.design.pattern.listener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LQL on 2017/3/19.
 */
public class ConcreteWatched implements Watched{

    List<Watcher> watchers = new ArrayList<>();

    @Override
    public void addWatcher(Watcher watcher) {
        watchers.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        watchers.remove(watcher);
    }

    @Override
    public void notifyWatchers(String str) {
        for (Watcher watcher : watchers){
            watcher.update(str);
        }
    }
}
