package com.lql.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by LQL on 2017/3/14.
 */
public class InvocationHandlerImp implements InvocationHandler{


    private Object obj;

    public InvocationHandlerImp(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("-----> before invoke");
        method.invoke(obj,args);
        System.out.println("-----> after invoke");
        return null;
    }
}
