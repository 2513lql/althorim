package com.lql.Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by LQL on 2017/3/9.
 */
public class Outter {



    private String outer = "hello";

    public void outerMethod(){
        System.out.println("this is outer method");
    }

    class Inner{

        private String string = "world";

        public void innerMethod(){
            System.out.println("this is inner method" + outer);
        }
    }

    public static void main(String[] args) {
        Outter outter = new Outter();
        Outter.Inner inner = outter.new Inner();
        inner.innerMethod();

        String[] s = {"a","v","c"};

        List<String> list = new ArrayList<String>(Arrays.asList(s));
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }


}
