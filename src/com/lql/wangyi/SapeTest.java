package com.lql.wangyi;

import java.util.ArrayList;

/**
 * Created by LQL on 2017/3/29.
 */
public class SapeTest {

    class  Shape{

        int sides = 0;
        Shape(){

        }

        Shape(int sides){
            this.sides = sides;
        }
        Shape(String aa){

        }

        public int getSides(){
            return sides;
        }


    }

    class Squre extends Shape{
        Squre(int x){
            sides = x;
        }
    }

    ArrayList<Object> arrayList;
    public static void main(String[] args) {
        SapeTest sapeTest = new SapeTest();
        Shape sq = sapeTest.new Squre(4);
        System.out.println(sq.getSides());
        Squre squre = sapeTest.new Squre(4);
        System.out.println(squre.getSides());
        int $ad=1;
        System.out.println($ad);
        int t=2;
        System.out.print(t|2);
        System.out.println(t&1);
        System.out.println(t++);
            System.out.println(t^1);
        System.out.println(sapeTest.arrayList);
    }

}
