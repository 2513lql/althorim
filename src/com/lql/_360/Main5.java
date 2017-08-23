package com.lql._360;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/29.
 */
public class Main5 {

    public static int a[] = new int[4];
    public static int flag = 0 ;
    static void dfs(double all, int[] res, int num) {
        if (num == 4) {
            if (all == 24) flag = 1 ;
            return ;
        }
        for (int i=0;i<4;i++) {
            if (res[i] == 0) {
                res[i] = 1 ;
                if (num != 0) {
                    dfs(all += a[i],res,num+1) ;
                    dfs(all -= a[i],res,num+1) ;
                    dfs(all *= a[i],res,num+1) ;
                    dfs(all /= (a[i]*1.0),res,num+1) ;

                } else {
                    dfs(a[i],res,num+1) ;
                }
                res[i] = 0 ;
            }
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i < 4;i++){
            a[i] = scanner.nextInt();
        }
        int[] res = new int[4];
        dfs(0,res,0);
        if (flag == 1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

}
