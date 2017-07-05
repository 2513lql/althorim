package com.lql.contest;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by LQL on 2017/4/2.
 */
public class MainH {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        for (int k=0; k < t;k++){
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String,Integer> map = new HashMap<String,Integer>();
            for (int i = 0 ;i < n;i++){
            String str = scanner.nextLine();

            String key = str.substring(0,str.lastIndexOf(' '));
            int value = Integer.parseInt(str.substring(str.lastIndexOf(' ') + 1));
            map.put(key,value);
            }
            System.out.println(changeLetters(a,b,map));
        }

    }

    public static int changeLetters(String a ,String b,Map<String,Integer> map){
        int res = 0;
        if (a.length() != b.length()) return -1;
        for (int i = 0;i < a.length();i++){
            char ac = a.charAt(i);
            char bc = b.charAt(i);
            if (ac != bc){
                String key1 = ac + " " + bc;
                String key2 = bc + " " + ac;
                if (map.get(key1) != null && map.get(key2) != null){
                    res += Math.min(map.get(key1),map.get(key2));
                }else if (map.get(key1) != null){
                    res += map.get(key1);
                }else if (map.get(key2) != null){
                    res += map.get(key2);
                }else {
                    return -1;
                }
            }
        }
        return res;
    }


}
