package com.lql.graph;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by LQL on 2016/10/30.
 */
public class Dijistra {




    public static Distance[] dijistra(int[][] graph){
        Distance[] dis = new Distance[graph.length];
        for (int i = 0 ; i < graph.length ;i++){
            dis[i] = new Distance();
        }
        if (graph ==null || graph.length == 0){
            return dis;
        }

        for (int i = 0 ; i < graph[0].length;i++){
            if (i == 0){
                dis[i].dis = 0;
                dis[i].hasVisit = true;
            }else{
                dis[i].dis = 2147483640;
                dis[i].hasVisit = false;
            }
        }
        int lastIndex = 0;
        int lastDis = 0;
        int currentMinIndex = -1;
        Integer currentMinDis;
        for (int k = 0 ; k < graph.length ; k++){
            currentMinDis = 2147483640;
            for (int i = 0;i < graph[lastIndex].length;i++){
                if (dis[i].hasVisit == false){
                    if (lastDis + graph[lastIndex][i] < dis[i].dis){
                        dis[i].dis = lastDis + graph[lastIndex][i];
                    }
                    if (dis[i].dis < currentMinDis){
                        currentMinIndex = i;
                        currentMinDis = dis[i].dis;
                    }
                }
            }
            dis[currentMinIndex].hasVisit = true;
            lastIndex = currentMinIndex;
            lastDis = currentMinDis;
        }
        return dis;
    }

    public static void main(String[] args) {
        Integer max = 2147483640;
        int[][] graph = {
                {0,4,2,max,max,max},
                {4,0,1,max,max,max},
                {2,1,0,1,max,8},
                {max,max,1,0,2,5},
                {max,max,max,2,0,1},
                {max,max,8,5,1,0},
        };
        Distance[] distances = dijistra(graph);
        for (int i = 0 ; i < distances.length;i++){
            System.out.print(distances[i].dis + " ");
        }
    }

}
