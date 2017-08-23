package com.lql.offer;

import java.util.ArrayList;

/**
 * Created by LQL on 2017/3/27.
 */
public class BitReverse {

    public static void BitReverse(short a){


        a = (short) (((a & 0xAAAA) >> 1) | ((a & 0x5555) << 1));
        a = (short) (((a & 0xCCCC) >> 2) | ((a & 0x3333) << 2));
        a = (short) (((a & 0xF0F0) >> 4) | ((a & 0x0F0F) << 4));
        a = (short) (((a & 0xFF00) >> 8) | ((a & 0x00FF) << 8));

        System.out.println(Integer.toBinaryString(Integer.valueOf(a)));
    }


    public static void main(String[] args) {
//        short a =(short) 34520;
//        BitReverse(a);
        ArrayList<BitReverse> arrayLis=new ArrayList<>();
        while (true){
            arrayLis.add(new BitReverse());
        }

    }
}
