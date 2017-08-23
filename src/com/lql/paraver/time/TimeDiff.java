package com.lql.paraver.time;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * Created by zyczyc on 2017/7/6.
 */
public class TimeDiff {


    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0 ; i < 10 ; i++){
            int d = random.nextInt(7) - 3;
            System.out.println(d);
        }

    }


}
