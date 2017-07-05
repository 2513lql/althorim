package com.lql.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LQL on 2017/3/14.
 */
public class ReflectTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

//        for (Method method : list.getClass().getMethods()){
//            System.out.println(method);
//        }
        try {
            System.out.println(list.getClass().getConstructor());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        try {
            Class<?> class1 = Class.forName("java.lang.String");
            Class<?> parentClass = class1.getSuperclass();
            System.out.println(parentClass.getName());
            class1.getDeclaredFields();
            try {
                Object object = class1.newInstance();
                try {
                    Method method = class1.getMethod("substring");
                    try {
                        method.invoke(object);
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
