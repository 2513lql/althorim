package com.lql.ali;

/**
 * Created by liqilong on 2017/8/22.
 */
public class CodeTest {

    private static final int a = 10;
    private static String s = "hello world";
    private final int b = 2;
    private static Object obj = null;
    private int c;

    static {

        obj = new Object();
    }

    public int getC(){

        return c;

    }

    public void  setC(int c){

        this.c = c;

    }

    public CodeTest(int c){
        this.c = c;
    }

    public CodeTest(){

    }

    public static void main(String[] args) {

        CodeTest codeTest = new CodeTest();
        codeTest.setC(5);

        System.out.println(codeTest.getC());

    }

}
