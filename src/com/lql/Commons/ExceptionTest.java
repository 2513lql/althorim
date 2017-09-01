package com.lql.Commons;

import java.io.IOException;

/**
 * Created by LQL on 2017/3/4.
 */
public class ExceptionTest {



    public static String testException(int a){

        try {
            if (a == 1)
                throw new Exception("hhh");
        }catch (Exception e){

            System.out.println(e.getMessage());
            return "exception block";
        }finally {
            System.out.println("this is finally");
//            return "finally block";
        }
        return "res";
    }


    public static void main(String[] args) {
//        NullPointerException exception = new NullPointerException();
//        IOException ioException = new IOException();
        System.out.println(testException(1));
    }

}
