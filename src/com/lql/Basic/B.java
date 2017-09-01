package com.lql.Basic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by LQL on 2017/3/4.
 */
public class B extends A{

    @Override
    public void method(){
        super.method();
    }

    @Override
    public void method2() throws FileNotFoundException,IndexOutOfBoundsException {
//        super.method2();
    }
}
