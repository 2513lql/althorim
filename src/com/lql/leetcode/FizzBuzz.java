package com.lql.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LQL on 2016/11/21.
 */
public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> results = new ArrayList<>();
        String three = "Fizz";
        String five = "Buzz";
        String threeAndFive = "FizzBuzz";

        for (int i = 1 ; i <= n;i++){
            int t = i % 3;
            int f = i % 5;
            if (t == 0 && f != 0){
                results.add(three);
            }else if (t != 0 && f == 0){
                results.add(five);
            }else if (t == 0 && f == 0){
                results.add(threeAndFive);
            }else {
                results.add(i + "");
            }
        }
        return results;
    }

    public static void main(String[] args) {
        List<String> res = fizzBuzz(15);
        for (String s : res){
            System.out.print(s + " ");
        }
    }

}
