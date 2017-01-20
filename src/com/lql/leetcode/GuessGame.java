package com.lql.leetcode;

/**
 * Created by LQL on 2016/11/8.
 */
public class GuessGame {

    public static int guessNumber(int n) {

        return helper(1,n);
    }

    public static int helper(int start,int end){
        if (start == end) return start;
        int mid = (start + end) / 2;
        int r;
        if (guess(mid) == 0) return mid;
        else if (guess(mid) == -1) r = helper(start, mid - 1);
        else  r = helper(mid + 1,end);
        return  r;
    }

    public static int guess(int n){
        return 0;
    }

    public static void main(String[] args) {
        int a = 2126753390;
    }

}
