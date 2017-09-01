package com.lql.wangyi;

import org.omg.CORBA.MARSHAL;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Administrator on 2017/8/12.
 */
public class Main2 {

    public static void func(){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int []x = new int[n];
            int []y = new int[n];
            int[] res = new int[n];
            for (int i = 0 ; i < n ; i++){
                x[i] = scanner.nextInt();
            }
            for (int j = 0 ; j < n;j++){
                y[j] = scanner.nextInt();
            }
            int meanx ,meany,maxIndex = -1;
            double sumx = 0;
            double sumy = 0;
            for (int i = 0 ; i < n;i++){
                sumx += x[i];
                sumy += y[i];
            }

            Set<Integer> set = new HashSet<>();
            for (int j = n - 1; j > 0;j--){
                if (maxIndex != -1){
                    sumx -= x[maxIndex];
                    sumy -= y[maxIndex];
                    set.add(maxIndex);
                }
                meanx = (int) Math.round(sumx / (j + 1));
                meany = (int) Math.round(sumy / (j + 1));

                int tmp = 0;
                int min = Integer.MAX_VALUE;

                for (int i = 0 ; i < n ;i++){
                    if (set.contains(i)){
                        continue;
                    }
                    int t = Math.abs(x[i] - meanx) + Math.abs(y[i] - meany);
                    int t2 = (int) Math.round((sumx - x[i])/ j) - x[i] + (int) Math.round((sumy - y[i])/j) - y[j];

                    if (t2 < min){
                        min  = t2;
                        maxIndex = i;
                    }
                    tmp = tmp + t;
                }
                res[j] = tmp;
            }
            for (int j = 0 ; j < n ;j++){
                if (j < n -1) {
                    System.out.print(res[j] + " ");
                }else {
                    System.out.print(res[j]);
                }
            }

        }
    }


    public static void main(String[] args) {
        func();
    }

}
