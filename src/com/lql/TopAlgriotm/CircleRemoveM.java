package com.lql.TopAlgriotm;

/**
 * Created by Administrator on 2017/3/8.
 *
 * 从一个0，1,2...n-1的n个数中不断删除第m个数，求剩余的一个数
 */
public class CircleRemoveM {


    public static int removeMCirCle(int n,int m){


        int count = 0;
        int index = 0;
        boolean[] deletes = new boolean[n];
        while (count < n - 1){

            int tmpCount = 0;
            while (true){
                if (!deletes[index]){
                    tmpCount++;
                }
                if (tmpCount == m){
                    deletes[index] = true;
                    count++;
                    while (true){
                        index = (index + 1) % n;
                        if (deletes[index] == false){
                            break;
                        }
                    }
                    break;
                }
                index = (index + 1) % n;
            }
        }
        for (int i = 0; i < n;i++){
            if (deletes[i] == false){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(removeMCirCle(3,2));
    }

}
