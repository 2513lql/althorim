package com.lql.dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LQL on 2016/11/3.
 */
public class AvoidRoads {


    public static long numWays(int width,int height,String[] bad){

        long [][] result = new long[width + 1][height + 1];
        List<String> badList = new ArrayList<>(Arrays.asList(bad));
        result[0][0] = 0;
        boolean badFlag = false;
        for (int i = 0 ; i < height;i++){
            String way1 = "0 " + i +" 0 " + (i + 1);
            String way2 = "0 " + (i + 1) +" 0 " + i;
            if ((badList.contains(way1) || badList.contains(way2)) && badFlag == false){
                badFlag = true;
            }
            if (badFlag == false){
                result[0][i + 1] = 1;
            }else{
                result[0][i + 1] = 0;
            }
        }
        badFlag = false;
        for (int j = 0 ; j < width ; j++){
            String way = j + " 0 " + j + 1 + " 0";
            String way2 = (j + 1) + " 0 " + j + " 0";
            if ((badList.contains(way) || badList.contains(way2)) && badFlag == false){
                badFlag = true;
            }
            if (badFlag == false){
                result[j + 1][0] = 1;
            }else{
                result[j + 1][0] = 0;
            }
        }

        for (int i = 1 ; i <= width;i++)
            for (int j = 1 ; j <= height;j++){
                String widthWay1 = (i - 1) + " " + j + " " + i + " " + j;
                String widthWay2 = i + " " + j + " " + (i - 1) + " " + j;
                long widthWayNumber = result[i - 1][j];
                if (badList.contains(widthWay1) || badList.contains(widthWay2)){
                    widthWayNumber = 0;
                }
                String heightWay1 = i + " " + (j - 1) + " " + i + " " + j;
                String heightWay2 = i + " " + j + " " + i + " " + (j - 1);
                long heightWayNumber = result[i][j - 1];
                if (badList.contains(heightWay1) || badList.contains(heightWay2)){
                    heightWayNumber = 0;
                }
                result[i][j] = widthWayNumber + heightWayNumber;
            }
        return result[width][height];
    }

    public static void main(String[] args) {

        String[] bad = {"0 0 0 1","6 6 5 6"};
        System.out.println(numWays(6,6,bad));

    }

}
