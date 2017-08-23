package com.lql.TopAlgriotm;

/**
 * Created by LQL on 2017/4/17.
 */
public class Square8Num {


    public static boolean result = false;
    public static void isOk(int[] A,int[] res,int cur,boolean[] isVisit){

        if (cur == A.length){

            if (res[0] + res[1] + res[2] + res[3] == res[4] + res[5] + res[6] + res[7] &&
                    res[0] + res[2] + res[4] + res[6] == res[1] + res[3] + res[5] + res[7]&&
                    res[0] + res[1] + res[4] +res[5] == res[2] + res[3] + res[6] + res[7]){
                result = true;
            }
        }else {

            for (int i = 0 ; i < A.length;i++){

                if (isVisit[i] == false){
                    isVisit[i] = true;
                    res[cur] = A[i];
                    if (result == true) return ;
                    isOk(A,res,cur + 1,isVisit);
                    isVisit[i] = false;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] A = {1,2,3,1,2,3,2,2};
        int[] B = {1,2,3,1,8,3,2,2};
        int[] res = new int[8];
        boolean[] isVisit = new boolean[8];
        isOk(B,res,0,isVisit);
        System.out.println(result);
    }

}
