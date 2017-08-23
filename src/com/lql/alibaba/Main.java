package com.lql.alibaba;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/4/26.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> inputs = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if(line != null && !line.isEmpty()) {
            int res = resolve(line.trim());
            System.out.println(String.valueOf(res));
        }
    }

    // write your code here
    public static int resolve(String expr) {
        ArrayList<Integer> arrayList = new ArrayList<>(16);
        int res = -1;
        int index = -1;
        String[] strings = expr.split("\\s+");
        for (int i = 0 ; i < strings.length;i++){
            String cur = strings[i];
            if (cur.equals("*")){
                if (index < 0) return -1;
                int a = arrayList.get(index);
                arrayList.remove(index);
                index--;
                if (index < 0) return -1;
                int b = arrayList.get(index);
                arrayList.remove(index);
                index--;
                arrayList.add(a * b);
                index++;
            }
            else if (cur.equals("+")){
                    if (index < 0) return -1;
                    int a = arrayList.get(index);
                    arrayList.remove(index);
                    index--;
                    if (index < 0) return -1;
                    int b = arrayList.get(index);
                    arrayList.remove(index);
                    index--;
                    arrayList.add(a + b);
                    index++;
            }
            else if (cur.equals("^")){
                if (index < 0){
                    return -1;
                }
                int a = arrayList.get(index);
                arrayList.remove(index);
                index--;
                a++;
                arrayList.add(a);
                index++;
            }else {
                if (index == 15){
                    return -2;
                }
                arrayList.add(Integer.parseInt(cur));
                index++;
            }
        }
        if (index < 0) return -1;
        else if (index > 15) return -2;
        return arrayList.get(index);
    }

}
