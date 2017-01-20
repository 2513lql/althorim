package com.lql.dynamic;

/**
 * Created by LQL on 2016/11/2.
 */
public class NMApple {

    public static int maxApple(int[][] S){
        int[][] result = new int[S.length][S[0].length];

        result[0][0] = S[0][0];

        for (int i= 1; i < S[0].length ; i++){
            result[0][i] = result[0][i - 1] + S[0][i];
        }
        for (int i = 1;i < S.length;i++){
            result[i][0] = result[i - 1][0] + S[i][0];
        }
        for (int i = 1; i < result.length; i++)
            for (int j = 1 ; j < result[0].length;j++){
                result[i][j] = -1;
            }

        for (int i = 1 ; i < S.length;i++)
            for (int j = 1 ; j < S[i].length;j++){
                if (result[i - 1][j] > 0 && result[i][j - 1] > 0){
                    int max = result[i - 1][j] > result[i] [j - 1] ? result[i - 1][j] : result[i][j - 1];
                    result[i][j] = max + S[i][j];
                }
            }
        return result[S.length - 1][S[0].length - 1];
    }

    public static void main(String[] args) {
        int[][] S = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(maxApple(S));
    }
}
