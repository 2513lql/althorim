package com.lql.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LQL on 2016/11/7.
 */
public class Anagrams {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] hash = new int[128];
        for (int i = 0 ; i < p.length();i++){
            hash[p.charAt(i)]++;
        }
        int left = 0 , right = 0 , count = p.length();
        while (right < s.length()){
            if (hash[s.charAt(right++)]-- >= 1) count--;

            if (count==0) result.add(left);

            if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) count++;
        }
        return result;
    }
    public static boolean isAnagrams(String s1,String s2){
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for (int i = 0 ; i <= 'z' - 'a';i++){
            Character a = (char) ('a' + i);
            map1.put(a , -1);
            map2.put(a , -1);
        }
        for (int i = 0 ; i < s1.length();i++){
            char tmp = s1.charAt(i);
            char tmp2 = s2.charAt(i);
            Integer i1 = map1.get(tmp);
            Integer i2 = map2.get(tmp2);
            i1++;
            i2++;
            map1.put(tmp,i1);
            map2.put(tmp2,i2);
        }
        for (int i = 0 ; i <= 'z' - 'a';i++){
            Character a = (char) ('a' + i);
            if (map1.get(a) != map2.get(a)){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        List<Integer> res = findAnagrams("abab","ab");
        for (Integer i : res){
            System.out.print(i + " ");
        }
    }

}
