package com.lql.graph;

import com.lql.leetcode.tree.TreeNode;
import com.lql.wangyi.Parent;

import java.util.*;

/**
 * Created by LQL on 2017/5/28.
 *
 *
 * 图的算法
 *
 *
 *
 */
public class Graph2 {


    private static char[] mVex;
    private static int[][] mMatrix;
    private static int INF = Integer.MAX_VALUE;


    public static void initGraph(char[] vex,int[][] matrix){

        mVex = new char[vex.length];
        for (int i = 0 ; i < mVex.length;i++){
            mVex[i] = vex[i];
        }

        mMatrix = new int[vex.length][vex.length];
        for (int i = 0 ; i < matrix.length;i++){
            for (int j = 0;j < matrix[i].length;j++){
                mMatrix[i][j] = matrix[i][j];
            }
        }
    }


    public static void DFS(){

        boolean[] flag = new boolean[mVex.length];

        for (int i = 0 ; i < mVex.length;i++){
            DFS(flag,i);
        }
    }

    public static void DFS(boolean[] flag,int i){
        if (flag[i] == true){
            return;
        }
        flag[i] = true;
        System.out.println("----->" + mVex[i]);
        for (int w = getFirstVex(i) ; w != -1;w = getVexNext(i,w)){
            if (!flag[i])
              DFS(flag,w);
        }
    }


    public static void BFS(){

        boolean[] isVisit = new boolean[mVex.length];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0 ; i < mVex.length;i++){

            if (!isVisit[i]){
                isVisit[i] = true;
                System.out.println("---->" + mVex[i]);
                queue.offer(i);
            }
            while (!queue.isEmpty()){
                int k = queue.poll();
                for (int j = getFirstVex(k);j != -1;j = getVexNext(k,j)){
                    if (!isVisit[j]){
                        isVisit[j] = true;
                        System.out.println("----->" + mVex[j]);
                        queue.offer(j);
                    }
                }
            }
        }

    }



    static class Edata{

        char beign;
        char end;
        int weight;
        public Edata(char beign,char end,int weight){
            this.beign = beign;
            this.end = end;
            this.weight = weight;
        }
    }

    public static void kruskal(){
        Edata[] res = new Edata[mVex.length];
        int[] vEnds = new int[mVex.length];//保存最小生成树每个顶点在最小生成树中顶点
        Edata[] edegs = getGraphEdeges();
        sortEdeges(edegs);
        int index = 0;
        for (int i= 0 ; i < mVex.length;i++){
            int p1 = getPosition(edegs[i].beign);
            int p2 = getPosition(edegs[i].end);

            int m = getEnd(vEnds,p1);
            int n = getEnd(vEnds,p2);
            while (m != n){
                vEnds[m] = n;
                res[index++] = edegs[i];
            }
        }
    }



    private static int getPosition(char c) {
        for (int i = 0; i < mVex.length;i++){
            if (mVex[i] == c){
                return i;
            }
        }
        return -1;
    }
    private static int getEnd(int[] vends,int p){
        while (vends[p] != 0){
            p = vends[p];
        }
        return p;
    }

    public static Edata[] getGraphEdeges(){
        Edata[] edegs = new Edata[mVex.length];
        int index = 0;
        for (int i = 0 ; i < mMatrix.length;i++){
            for (int j = i + 1;j < mMatrix.length;j++){
                if (mMatrix[i][j] != 0){
                    char begin = mVex[i];
                    char end = mVex[j];
                    edegs[index++] = new Edata(begin,end,mMatrix[i][j]);
                }
            }
        }
        return edegs;
    }

    public static void sortEdeges(Edata[] edegs){

        Arrays.sort(edegs, new Comparator<Edata>() {
            @Override
            public int compare(Edata o1, Edata o2) {
                return o1.weight - o2.weight;
            }
        });

    }

    //取得某节点的第一个邻接节点
    public static int getFirstVex(int v){

        for (int i = 0; i < mVex.length;i++){
            if (mMatrix[v][i] != 0){
                return i;
            }
        }
        return -1;
    }

    //获取节点的某节点的下一个临界节点
    public static int getVexNext(int v,int w){

        for (int i = w + 1 ; i < mVex.length;i++){
            if (mMatrix[v][i] != 0){
                return i;
            }
        }
        return -1;
    }

    public static void dijistrs(int v){
        int[] dist = new int[mVex.length];
        int[] prev = new int[mVex.length];
        boolean[] flag = new boolean[mVex.length];

        for (int i = 0;i < mMatrix.length;i++){
            dist[i] = mMatrix[v][i];
            prev[i] = v;
        }

        //将节点v设为已可达
        dist[v] = 0;
        flag[v] = true;

        for (int i = 0; i < dist.length - 1;i++){
            int k = 0;
            int min = Integer.MAX_VALUE;
            for (int j = 0 ; j < dist.length;j++){
                if (!flag[j] && dist[j] < min){
                    k = j;
                    min = dist[j];
                }
            }
            dist[k] = min;
            for (int j = 0 ;j < dist.length;j++){

                int tmp = mMatrix[k][j] == INF ? INF : (min + mMatrix[k][j]);
                if (!flag[j]&&dist[j] > tmp){
                    dist[j] = tmp;
                    prev[j] = k;
                }

            }
        }
    }


    public static void main(String[] args) {
        char[] vexs = {'A','B','C','D','E','F','E'};
        int[][] matrix = {
                {   0,  12, INF, INF, INF,  16,  14},
                {  12,   0,  10, INF, INF,   7, INF},
                { INF,  10,   0,   3,   5,   6, INF},
                { INF, INF,   3,   0,   4, INF, INF},
                { INF, INF,   5,   4,   0,   2,   8},
                {  16,   7,   6, INF,   2,   0,   9},
                {  14, INF, INF, INF,   8,   9,   0}
        };
//        int[][] matrix = {
//                {   0,  1, 0, 0, 0,  0,  0},
//                {  0,   0,  10, 0, 0,   7, 0},
//                { 0,  10,   0,   3,   5,   6, 0},
//                { 0, 0,   3,   0,   4, 0, 0},
//                { 0, 0,   5,   4,   0,   2,   8},
//                {  16,   7,   6, 0,   2,   0,   9},
//                {  14, 0, 0, 0,   8,   9,   0}
//        };
//        int[][] matrix = {{0,1,0,1,1,0},
//                          {1,0,1,0,0,0},
//                          {0,1,0,1,0,1},
//                          {1,0,1,0,0,0},
//                          {1,0,0,0,0,1},
//                          {0,0,1,0,1,0}};
        initGraph(vexs,matrix);
//        DFS();
//        BFS();

   
    }

}
