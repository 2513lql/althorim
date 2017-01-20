package com.lql.leetcode;

/**
 * Created by LQL on 2016/11/21.
 */
public class IslandPerimeter {

    public static int islandPerimeter(int[][] grid) {
        int res = 0;

        for (int i = 0 ; i < grid.length;i++)
            for (int j = 0 ; j < grid[i].length;j++){
                if (grid[i][j] == 1){

                    if (i == 0){
                        res++;
                        if (i + 1 < grid.length && grid[i + 1][j] == 0){
                            res++;
                        }
                    }
                    if (i == grid.length - 1){
                        res++;
                        if (i - 1 >= 0 && grid[i - 1][j] == 0){
                            res++;
                        }
                    }
                    if (j == 0){
                        res++;
                        if (j + 1 < grid[i].length&&grid[i][j + 1] == 0){
                            res++;
                        }
                    }
                    if (j == grid[i].length - 1){
                        res++;
                        if (j - 1 >= 0 && grid[i][j - 1] == 0){
                            res++;
                        }
                    }
                    if ( 0 < i && i < grid.length -1){
                        if (grid[i - 1][j] == 0){
                                res++;
                        }
                        if (grid[i + 1][j] == 0){
                            res++;
                        }
                    }
                    if (0 < j && j < grid[i].length - 1){
                        if (grid[i][j - 1] == 0){
                            res++;
                        }
                        if (grid[i][j + 1] == 0){
                            res++;
                        }
                    }

                }
            }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = {{1}};
        System.out.println(islandPerimeter(grid));
    }

}
