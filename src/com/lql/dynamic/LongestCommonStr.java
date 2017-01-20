package com.lql.dynamic;

import sun.plugin.net.protocol.jar.CachedJarURLConnection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LQL on 2016/11/18.
 */
public class LongestCommonStr {


    public static List<Character> longestCommonStr(char []s1, char []s2){

        int m = s1.length;
        int n = s2.length;
        int[][] count = new int[m + 1][n + 1];
        int[][] tmp = new int[m + 1][n + 1];
        for (int i = 0 ; i <= m;i++){
            count[i][0] = 0;
        }
        for (int i = 0 ; i <= n ; i++){
            count[0][i] = 0;
        }
        for (int i = 1;i <= m;i++)
            for (int j = 1 ; j <= n ;j++){
                if (s1[i - 1] == s2[j - 1]){
                    count[i][j] = count[i - 1][j - 1] + 1;
                    tmp[i][j] = 0;
                }
                else if (count[i-1][j] >= count[i][j - 1]){
                    count[i][j] = count[i-1][j];
                    tmp[i][j] = 1;
                }else{
                    count[i][j] = count[i][j - 1];
                    tmp[i][j] = -1;
                }

            }
        System.out.println(count[m][n]);
        List<Character> res = new ArrayList<>();
        res = getLSC(tmp,s1,m,n,res);
        return res;
    }

    public static List<Character> getLSC(int[][] tmp,char[] s1,int m,int n,List<Character> res){

        if (m == 0 || n == 0){
            return res;
        }
        if (tmp[m][n] == 0){
            res.add(s1[m - 1]);
            return getLSC(tmp,s1,m - 1,n - 1,res);
        }
        else if (tmp[m][n] == 1){
            return getLSC(tmp,s1,m - 1,n,res);
        }else{
            return getLSC(tmp,s1,m , n -1,res);
        }
    }

    public static void main(String[] args) {
        char[] s1 = {'A','B','C','B','D','A','B'};
        char[] s2 = {'B','D','C','A','B','A'};
        System.out.println(longestCommonStr(s1,s2));
    }


}
