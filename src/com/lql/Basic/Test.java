package com.lql.Basic;

/**
 * Created by LQL on 2017/3/3.
 */
public class Test {


    protected void hello2(){

    }




    public static void main(String[] args) {
        String str = new String("hello");
        String str1 = new String("hello");
        System.out.println(str == str1);

        Test2 test2 = new Test2();
        test2.hello();
    }

}
