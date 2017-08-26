package com.lql.graph;

import java.nio.channels.Pipe;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by LQL on 2017/5/22.
 *
 * 邻接矩阵存储无向图
 *
 */
public class Graph {


    private static char[] graphVexs; //一维数组 定点集合
    private static int[][] graphEdegs;  //边集合

    /**
     * 创建图
     */
    public Graph(){
        //输入顶点数和边数
        System.out.println("input vertex number:");
        int vlen = readInt();
        System.out.println("input edeg number:");
        int edegLen = readInt();
        if (vlen < 1 || edegLen < 1 || edegLen > (vlen * (vlen - 1))){
            System.out.println("input error");
            return;
        }
        graphVexs = new char[vlen];
        graphEdegs = new int[vlen][vlen];
        for (int i = 0; i < vlen;i++){
            System.out.println("vertex : " + i);
            graphVexs[i] = readChar();
        }
        for (int i = 0 ; i < edegLen;i++){
            System.out.println("edeg : " + i);
            char c1 = readChar();
            char c2 = readChar();
            int pos1 = getPosition(c1);
            int pos2 = getPosition(c2);
            if (pos1 == -1 || pos2 == -1){
                System.out.println(" input error ");
                return;
            }
            graphEdegs[pos1][pos1] = 1;
            graphEdegs[pos2][pos1] = 1;
        }
    }

    /*预置参数构造图的邻接矩阵*/
    public Graph(char[] vexs,char[][] edeges){

        int vlen = vexs.length;
        int elen = edeges.length;
        graphVexs = new char[vlen];
        graphEdegs = new int[vlen][vlen];
        for (int i = 0 ; i < graphVexs.length;i++){
            graphVexs[i] = vexs[i];
        }
        for (int i = 0 ; i < edeges.length;i++){

            int pos1 = getPosition(edeges[i][0]);
            int pos2 = getPosition(edeges[i][1]);
            graphEdegs[pos1][pos2] = 1;
            graphEdegs[pos2][pos1] = 1;
        }
    }



    private int getPosition(char c){
        for (int i = 0; i < graphVexs.length;i++){
            if (graphVexs[i] == c){
                return i;
            }
        }
        return -1;
    }
    private static char readChar() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char c = s.charAt(0);
        return c;
    }

    private int readInt() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i;
    }


    /**
     * 找到顶点V的第一个临界顶点的索引
     * @param v
     * @return
     */
    public static int getFirstVexes(int v){

        if (v < 0 || v > graphVexs.length - 1){
            return -1;
        }
        for (int i = 0 ; i < graphVexs.length;i++){
            if (graphEdegs[v][i] == 1){
                return i;
            }
        }
        return -1;
    }

    /**
     * 找到 顶点v 相对于w的下一个邻接顶点
     * @param v
     * @param w
     * @return
     */
    public static int getNextVexes(int v,int w){
        if (v < 0 || v > graphVexs.length - 1 || w < 0 || w > graphVexs.length - 1){
            return -1;
        }
        for (int i = w + 1; w < graphVexs.length;i++){
            if (graphEdegs[v][i] == 1){
                return i;
            }
        }
        return -1;
    }

    private void DFS(int i,boolean[] isVisit){
        isVisit[i] = true;
        System.out.println("节点 : " + graphVexs[i]);
        for (int w = getFirstVexes(i);w >= 0;w = getNextVexes(i,w)){
            if (!isVisit[w]){
                DFS(w,isVisit);
            }
        }
    }

    /**
     * 深度优先遍历
     */
    private void DFS(){

        boolean[] isVisited = new boolean[graphVexs.length];

        for (int i = 0; i < graphVexs.length;i++){

            if (!isVisited[i]){
                DFS(i,isVisited);
            }
        }
    }

    /**
     * 广度优先遍历
     */
    private void BFS(){
        boolean[] isVisit = new boolean[graphVexs.length];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0 ;i < graphVexs.length;i++){
            if (!isVisit[i]){
                isVisit[i] = true;
                System.out.println(graphVexs[i]);
                queue.offer(i);
            }
            while (!queue.isEmpty()){
                int k = queue.poll();
                for (int j = getFirstVexes(k);j >= 0;j = getNextVexes(k,j)){
                    if (!isVisit[j]){
                        isVisit[j] = true;
                        System.out.println(graphVexs[i]);
                        queue.offer(j);
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
//        char[] chars = new char[3];
//        for (int i = 0 ; i < chars.length;i++){
//            chars[i] = readChar();
////            System.out.println(chars[i]);
//        }
//        for (char a : chars){
//            System.out.println(a);
//        }

        boolean[] isvisit = new boolean[2];
        for (boolean b : isvisit){
            System.out.println(b);
        }
    }


}
