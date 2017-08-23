package com.lql.graph;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by LQL on 2017/6/7.
 *
 * 图的深度优先遍历，广度优先遍历
 *
 */
public class GraphTravel {

    private static int[][] edegs;
    private static char[] vexes;
    private static int edgesNum=0; //边的数量

    public static void init(char[] vex,int[][] edeg){

        vexes = new char[vex.length];
        for (int i = 0 ; i < vexes.length;i++){
            vexes[i] = vex[i];
        }
        edegs = new int[vex.length][vex.length];
        for (int i = 0 ; i < vex.length;i++){
            for (int j = 0 ; j < vex.length;j++){
                edegs[i][j] = edeg[i][j];
                if (edeg[i][j] != 0) edgesNum++;
            }
        }
        edgesNum /= 2;
    }


    public static void dfs(){
        boolean[] isVisit = new boolean[vexes.length];
        for (int i = 0 ; i < vexes.length;i++){
            if (!isVisit[i]){
                dfs(i,isVisit);
            }
        }
    }

    public static int getFirstVex(int v){
        if (v < 0 || v >= vexes.length) return -1;
        for (int i = 0; i < edegs.length;i++){
            if (edegs[v][i] > 0){
                 return i;
            }
        }
        return -1;
    }

    public static int getNextVex(int v,int w){
        if (v < 0 || v >= vexes.length) return -1;
        if (w < 0 || w >= vexes.length) return -1;
        for (int i = w + 1; i < vexes.length;i++){
            if (edegs[v][i] > 0 ) return i;
        }
        return -1;
    }

    /**
     * 深度优先
     * @param v
     * @param isVisit
     */
    public static void dfs(int v,boolean[] isVisit){
        System.out.println(vexes[v]);
        isVisit[v] = true;
        for (int w = getFirstVex(v); w != -1;w = getNextVex(v,w)){
            if (!isVisit[w]){
                dfs(w,isVisit);
            }
        }
    }

    /**
     * 广度优先
     */
    public static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] isVisit = new boolean[vexes.length];
        for (int i = 0 ; i < vexes.length;i++){
            if (!isVisit[i]) {
                queue.offer(i);
                System.out.println(vexes[i]);
                isVisit[i] = true;
            }
            while (queue.size() > 0){
                int k = queue.poll();
                for (int w = getFirstVex(k);w != -1;w = getNextVex(k,w)){
                    queue.offer(w);
                }
            }
        }
    }


    static class Edata{
        char start;
        char end;
        int weight;
        public Edata(char start,char end,int weight){
            this.start=start;
            this.end=end;
            this.weight=weight;
        }
    }

    /**
     * 克鲁斯卡尔算法
     */
    public static void kruskal(){

        Edata[] edatas = getEdeges();
        int[] vends = new int[edgesNum];
        Edata[] res = new Edata[vexes.length - 1];
        int count = 0;
        sortEdeges(edatas);

        for (int i = 0 ; i < edatas.length && count < vexes.length;i++){
            int p1 = getPosition(edatas[i].start);
            int p2 = getPosition(edatas[i].end);
            int m = getVEnd(vends,p1);
            int n = getVEnd(vends,p2);
            if (m != n){
                vends[m] = n;
                res[count++] = edatas[i];
            }
        }

        
    }

    public static int getPosition(char v){
        for (int i = 0 ; i < vexes.length;i++){
            if (vexes[i] == v){
                return i;
            }
        }
        return -1;
    }

    public static int getVEnd(int[] vends,int v){
        while (vends[v] != 0){
            v = vends[v];
        }
        return v;
    }

    public static Edata[] getEdeges(){
        Edata[] edatas = new Edata[vexes.length];
        int index = 0;
        for (int i = 0 ; i < vexes.length;i++){
            for (int j = i + 1;j < vexes.length;j++){
                if (edegs[i][j] != 0){
                    edatas[index++] = new Edata(vexes[i],vexes[j],edegs[i][j]);
                }
            }
        }
        return edatas;
    }

    public static void sortEdeges(Edata[] edatas){
        Arrays.sort(edatas, new Comparator<Edata>() {
            @Override
            public int compare(Edata o1, Edata o2) {
                return o1.weight - o2.weight;
            }
        });
    }
}
