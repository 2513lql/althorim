package com.lql.graph;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by LQL on 2017/5/24.
 *
 * 最小生成树算法 kruskal & prim
 *
 */
public class MinimumTree {

    //边结构体
    static class Edata{
        char start;//边起点
        char end; //终点
        int weight; //权重
        public Edata(char start,char end,int weight){
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
    }

    private static char[] mVex; //顶点集合
    private static int[][] mMatrix; //存储图的邻接矩阵;
    private static int edegNum; //边的数量
    private static int INF = Integer.MAX_VALUE;//无穷大
    public static void initGraph(char[] vex,int[][] matrix){

        int vlen = vex.length;
        mVex = new char[vlen];

        for (int i = 0 ; i < vlen;i++){
            mVex[i] = vex[i];
        }
        mMatrix = new int[vlen][vlen];
        for (int i = 0 ; i < matrix.length;i++)
            for (int j = 0; j < matrix[i].length;j++){
                mMatrix[i][j] = matrix[i][j];
            }
        for (int i = 0; i < mMatrix.length;i++){
            for (int j = i + 1; j < mMatrix[i].length;j++){
                if (mMatrix[i][j] != INF){
                    edegNum++;
                }
            }
        }
    }

    /**
     * kruskal算法构造最小生成树
     */
    public static void kruskal(){

        Edata[] res = new Edata[edegNum]; //结果数组，用于保存最小生成树的边
        int index = 0; //最小生成树边数组的索引
        int[] vends = new int[edegNum];
        Edata[] edges; // 图对应的所有边
        edges = getGraphDatas();

        //将边按照权值大小进行排序
        sortEdges(edges,edegNum);

        for (int i = 0; i < edegNum;i++){

            int p1 = getPosition(edges[i].start);
            int p2 = getPosition(edges[i].end);

            int m = getEnds(vends,p1);
            int n = getEnds(vends,p2);
            if (m != n){
                vends[m] =  n;
                res[index++] = edges[i];
            }
        }

        /**
         * 统计打印最小生成树信息
         */
        int length = 0;
        for (int i = 0 ; i < index;i++){
            length += res[i].weight;
        }

        for (int i = 0 ; i < index;i++){
            System.out.print("(" + res[i].start + " , "+res[i].end + ")");
            System.out.print("--->");
        }
        System.out.println();
        System.out.println("all weight : " + length);
    }

    /**
     * 获取顶点的索引
     * @param c
     * @return
     */
    private static int getPosition(char c){
        for (int i = 0 ; i < mVex.length;i++){
            if (mVex[i] == c){
                return i;
            }
        }
        return -1;
    }


    /**
     * 获取节点i的终点
     * @param vends
     * @param i
     * @return
     */
    private static int getEnds(int[] vends,int i){
        while (vends[i] != 0){
            i = vends[i];
        }
        return i;
    }

    /**
     * 将图中边按权值排序
     * @param edges
     * @param edegNum
     */
    private static void sortEdges(Edata[] edges, int edegNum) {

        Arrays.sort(edges, new Comparator<Edata>() {
            @Override
            public int compare(Edata o1, Edata o2) {
                return o1.weight - o2.weight;
            }
        });
    }

    /**
     * 获取图中所有边
     * @return
     */
    public static Edata[] getGraphDatas() {
        Edata[] graphDatas = new Edata[edegNum];
        int index = 0;
        for (int i = 0 ; i < mVex.length;i++){
            for (int j = i + 1;j < mVex.length;j++){
                if (mMatrix[i][j] != INF){
                    graphDatas[index++] = new Edata(mVex[i],mVex[j],mMatrix[i][j]);
                }
            }
        }
        return graphDatas;
    }


    /**
     * 求最短路径算法，dijkstra   单源最短路径
     * 最短路径算法
     */
    public static void dijkstra(int vs){

        //flag[i] = true 表示定点vs到定点i的最短路径已成功获取
        boolean[] flag = new boolean[mVex.length];
        int[] dist = new int[mVex.length]; //dist表示顶点vs到顶点i的最短路径长度
        int[] prev = new int[mVex.length]; //pre[i]表示顶点vs到顶点i的最短路径所经过的全部顶点中，位于顶点i之前那个顶点
        //初始化
        for (int i = 0; i < mVex.length;i++){
            flag[i] = false;
            prev[i] = 0;
            dist[i] = mMatrix[vs][i];
        }
        //对定点vs进行初始化
        flag[vs] = true;
        dist[vs] = 0;

        //便利mvex.length - 1次，每次找出一个顶点的最短路径
        int k = 0;
        for (int i = 0 ; i <mVex.length - 1;i++){

            int min = INF;
            for (int j = 0 ; j < mVex.length;j++){
                if (!flag[j] && dist[j] < min){
                    min = dist[j];
                    k = j;
                }
            }
            //标记k已经获取最短路径
            flag[k] = true;

            //新加入一个节点，修正各结点的最短路径
            for (int j = 0 ; j < mVex.length;j++){
                int tmp = mMatrix[k][j] == INF ? INF : (mMatrix[k][j] + min);
                if (flag[j] == false && tmp < dist[j]){
                    dist[j] = tmp;
                    prev[j] = k;
                }
            }
        }

        System.out.println("定点" + mVex[vs]);
        for (int i = 0 ; i < mVex.length;i++){
            System.out.println(mVex[vs] + "--->"+mVex[i] + " : "+dist[i]);
        }
    }


    /**
     *flyod求各顶点间最短路径
     * path[i][j]=k  表示顶点i到顶点j的最短路径会经过顶点k
     * dist[i][j] i -- j之间的最短路径，
     * @param path
     * @param dist
     */
    public static void flyod(int[][] path,int[][] dist){

        //初始化
        for (int i = 0 ; i < mMatrix.length;i++){
            for (int j = 0 ; j < mMatrix[i].length;j++){
                dist[i][j] = mMatrix[i][j];
                path[i][j] = j;
            }
        }


        //求最短路径
        for (int k = 0;k < mVex.length;k++){
            for (int i = 0 ; i < mMatrix.length;i++)
                for (int j = 0 ; j < mMatrix.length;j++){
                    int tmp = (mMatrix[i][k] == INF || mMatrix[k][j] == INF) ? INF : mMatrix[i][k] + mMatrix[k][j];
                    if (tmp < dist[i][j]){
                        dist[i][j] = tmp;
                        path[i][j] = path[i][k];
                    }
                }
        }

        for (int i = 0 ; i < mVex.length;i++){
            for (int j = 0 ; j < mVex.length;j++){
                System.out.println("i --> j : " + dist[i][j]);
            }
        }

    }

    public static void main(String[] args) {
        char[] vexs = {'A','B','C','D','E','F','G'};
        int[][] matrix = {
                {   0,  12, INF, INF, INF,  16,  14},
                {  12,   0,  10, INF, INF,   7, INF},
                { INF,  10,   0,   3,   5,   6, INF},
                { INF, INF,   3,   0,   4, INF, INF},
                { INF, INF,   5,   4,   0,   2,   8},
                {  16,   7,   6, INF,   2,   0,   9},
                {  14, INF, INF, INF,   8,   9,   0}
        };
        initGraph(vexs,matrix);
//        kruskal();
        dijkstra(3);
    }

}
