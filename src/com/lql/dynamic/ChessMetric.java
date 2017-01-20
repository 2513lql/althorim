package com.lql.dynamic;

/**
 * Created by LQL on 2016/11/3.
 */
public class ChessMetric {
    public static long howMany(int size,int[] start,int[] end,int numMoves){
        long[][][] ways = new long[size][size][numMoves + 1];
        ways[start[0]][start[1]][0] = 1;
        for (int k = 1 ; k <= numMoves;k++)
            for (int i = 0 ; i < size;i++)
                for (int j = 0 ; j < size;j++){
                    long tmp = 0;
                    if (i - 1 >= 0){
                        tmp += ways[i - 1][j][k - 1];
                    }
                    if (j - 1 >= 0){
                        tmp += ways[i][j - 1][k - 1];
                    }
                    if (j - 1 >= 0&& i - 1 >=0){
                        tmp += ways[i - 1][j - 1][k - 1];
                    }
                    if (i - 1 >=0 && j + 1 < size){
                        tmp += ways[i - 1][j + 1][k - 1];
                    }
                    if (j + 1< size){
                        tmp += ways[i][j + 1][k - 1];
                    }
                    if (j + 1 < size && i + 1 < size){
                        tmp += ways[i + 1][j + 1][k - 1];
                    }
                    if (i + 1 < size){
                        tmp += ways[i+1][j][k - 1];
                    }
                    if (i + 1 < size && j - 1>=0){
                        tmp += ways[i + 1][j - 1][k - 1];
                    }
                    if (j + 2 < size && i - 1 >= 0){
                        tmp += ways[i - 1][j + 2][k - 1];
                    }
                    if (j + 2 < size && i + 1 < size){
                        tmp += ways[i + 1][j+2][k - 1];
                    }
                    if (i + 2<size && j + 1<size){
                        tmp += ways[i + 2][j+1][k - 1];
                    }
                    if (i + 1 < size && j - 2 >=0){
                        tmp += ways[i + 1][j - 2][k - 1];
                    }
                    if (i - 2>=0 && j - 1>=0){
                        tmp += ways[i - 2][j - 1][k - 1];
                    }
                    if (i - 1>=0&& j - 2>=0){
                        tmp += ways[i -1][j-2][k -1];
                    }
                    if (i+1 < size && j -2>=0){
                        tmp += ways[i + 1][j - 2][k - 1];
                    }
                    if (i + 2 < size && j - 1>=0){
                        tmp += ways[i+2][j - 1][k -1];
                    }
                    ways[i][j][k] = tmp;
                }

        return ways[end[0]][end[1]][numMoves];
    }

    public static void main(String[] args) {
        int[] start = {0,0};
        int[] end = {0,99};
        System.out.println(howMany(100,start,end,50));
    }
}
