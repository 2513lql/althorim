package com.lql.Basic;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * Created by LQL on 2017/3/4.
 *
 * 强引用，软引用，弱引用，虚引用
 */
public class Reference {

    public static void main(String[] args) {

        String str = new String("hello world"); //强引用

        System.out.println(str);

        SoftReference<String> sr = new SoftReference<String>(new String("hello"));//软引用
        System.out.println(sr.get());
        System.gc();
        System.out.println(sr.get());

        WeakReference<String>  wr = new WeakReference<String>(new String("world"));//弱引用
        System.out.println(wr.get());
        System.gc();
        System.out.println(wr.get());
    }

}
