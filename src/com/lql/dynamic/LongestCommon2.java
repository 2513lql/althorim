package com.lql.dynamic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LQL on 2016/11/18.
 */
public class LongestCommon2 {

    public static int[] longestCommon(int[] A1,int[] A2){

        int m = A1.length;
        int n = A2.length;
        int[][] count = new int[m + 1][n + 1];
        int[][] flags = new int[m + 1][n + 1];
        for (int i = 0 ; i <= m;i++){
            count[i][0] = 0;
        }
        for (int j = 0 ; j <= n;j++){
            count[0][j] = 0;
        }

        for (int i = 1 ; i <= m;i++)
            for (int j =1;j <= n;j++){
                if (A1[i - 1] == A2[j - 1]){
                    count[i][j] = count[i -1][j -1] + 1;
                    flags[i][j] = 0;
                }else if (count[i - 1][j] >= count[i][j - 1]){
                    count[i][j] = count[i-1][j];
                    flags[i][j]=1;
                }else{
                    count[i][j] = count[i][j-1];
                    flags[i][j]=-1;
                }
            }
        List<Integer> res = new ArrayList<>();
        res = getLSC(flags,A1,m ,n,res);
        int[] result = new int[res.size()];
        int len = res.size();
        for (int i = 0 ; i < res.size();i++){
            result[len - i - 1] = res.get(i);
        }
        return result;
    }

    public static List<Integer> getLSC(int[][] flags ,int[] A1,int m,int n ,List<Integer> res){
        if (m == 0 || n == 0){
            return res;
        }
        else if (flags[m][n] == 0){
            res.add(A1[m -1]);
            return getLSC(flags,A1,m - 1,n - 1,res);
        }else if (flags[m][n] == -1){
            return getLSC(flags,A1,m - 1,n,res);
        }else{
            return getLSC(flags,A1,m,n - 1,res);
        }
    }

    public static void main(String[] args) {
        int[] A1 = {1,0,0,1,0,1,0,1};
        int[] A2 = {0,1,0,1,1,0,1,1,0};
        int[] res = longestCommon(A1,A2);
        for (int i = 0 ; i < res.length;i++){
            System.out.println(res[i]);
        }
    }


}
