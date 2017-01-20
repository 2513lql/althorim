package com.lql.dynamic;

/**
 * Created by LQL on 2016/11/3.
 */
public class Dijistra {


    static class Dis{
        int dis;
        boolean hasVisit;
    }
    public static Dis[] getLastestPath(int[][] graph){
        Dis[] dises = new Dis[graph.length];
        int unreachable = Integer.MAX_VALUE - 10;
        int min = unreachable;
        int index = 0;
        for (int i = 0; i < graph.length;i++){
            Dis dis = new Dis();
            dis.dis = graph[0][i];
            if (i == 0){
                dis.hasVisit = true;
            }else{
                if (graph[0][i] < min){
                    min = graph[0][i];
                    index = i;
                }
                dis.hasVisit = false;
            }
            dises[i] = dis;
        }
        dises[index].hasVisit = true;
        for (int i = 1 ; i < graph.length;i++){
            min = unreachable;
            for (int j = 0 ; j < graph[i].length;j++){
                if (dises[j].hasVisit == false){
                    if (graph[index][j] < unreachable){
                        dises[j].dis = dises[index].dis + graph[index][j];
                    }
                    if (dises[j].dis < min){
                        index = j;
                        min = dises[j].dis;
                    }
                }
            }
            dises[index].hasVisit = true;
        }
        return dises;
    }

}
