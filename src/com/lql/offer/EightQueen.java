package com.lql.offer;

/**
 * Created by LQL on 2017/4/18.
 *
 * 八皇后问题
 *
 */
public class EightQueen {


    public static int count = 0;

    public static void eightQueen(int[] res,int cur,boolean[] isVisit){


        if (cur == 8){
            boolean flag = true;
            for (int i = 0 ; i < 8;i++){
                for (int j = 0; j < 8;j++){
                    if (i != j){
                        if (Math.abs(i - j) == Math.abs(res[i] - res[j]) || res[i] == res[j]){
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if (flag == true) {
                count++;
            }
        }else {
            for (int i = 0 ; i < 8;i++){
                if (isVisit[i] == false){
                    isVisit[i] = true;
                    res[cur] = i;
                    eightQueen(res,cur + 1,isVisit);
                    isVisit[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        boolean[] isVisit = new boolean[8];
        int[] res = new int[8];
        eightQueen(res,0,isVisit);
        System.out.println(count);
    }

}
