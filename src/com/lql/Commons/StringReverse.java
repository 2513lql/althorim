package com.lql.Commons;

import com.lql.Basic.Test;

/**
 * Created by LQL on 2017/3/3.
 */
public class StringReverse {



    public static String reverse(String origin){

        if (origin == null || origin.length() <= 1){
            return origin;
        }
        else{
            return reverse(origin.substring(1)) + origin.charAt(0);
        }
    }


    public static void main(String[] args) {
        System.out.println(reverse("hello"));
        Test test = new Test();
    }

}
