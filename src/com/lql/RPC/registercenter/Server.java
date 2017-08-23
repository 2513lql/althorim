package com.lql.RPC.registercenter;

import java.io.IOException;

/**
 * Created by zyczyc on 2017/8/6.
 */
public interface Server {

    public void stop();
    public void start() throws IOException;
    public void register(Class serviceInterface,Class impl);
    public boolean isRunning();
    public int getPort();

}
