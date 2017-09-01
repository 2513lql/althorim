package com.lql.BackTracing;

/**
 * Created by zyczyc on 2017/8/27.
 *
 * 回溯法解八皇后问题
 */
public class EightQueen {


    public static int count = 0;

    public static void dfs(int cur,int[] res,boolean[] isVisit){



        if (cur == 8){
            boolean flag = true;
            for (int i = 0;i < 8;i++){

                for (int j = 0;j < 8 ;j++){

                    if (i != j){
                        if (res[i] == res[j] || Math.abs(res[i] - res[j]) == Math.abs(i - j)){
                            flag = false;
                            break;
                        }
                    }
                }
            }
        }else {

            for (int i = 0; i < 8;i++){

                if (!isVisit[i]){

                    isVisit[i] = true;
                    res[cur] = i;
                    dfs(cur + 1,res,isVisit);
                    isVisit[i] = false;
                }

            }


        }



    }


}
