package com.lql.Basic;

/**
 * Created by LQL on 2017/3/4.
 *
 * 装箱，拆箱
 *
 */
public class IntegerToInt {


    public static void main(String[] args) {


        Integer i = 10; //装箱，等价于 ，变异后的class文件Integer.valueOf(10)

        Integer a = Integer.valueOf(10);

        int b = a.intValue();    //拆箱 等价于调用 a.intValue

//        Byte byte1 = Byte.valueOf();
        Character c = Character.valueOf('a');
        Double d = 2.3;

        Double d1 = Double.valueOf(2.3);

        Long l = Long.valueOf(1L);

        double d2 = d.doubleValue();

        Boolean b3 = Boolean.valueOf(false);

    }

}
