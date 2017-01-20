package com.lql.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LQL on 2016/11/29.
 */
public class BinaryWatch {
    private static void rec(int ret, List<Integer> ans, int cnt, int limit, int start) {
        int hh = (ret & 15);
        int mm = (ret >> 4);
        if(hh >= 12 || mm >= 60) {
            return;
        }
        if(cnt == 0) {
            //System.out.println(ret);
            ans.add(ret);
            return;
        }

        for(int i = start; i < limit; i ++) {
            if((ret & (1 << i)) == 0) {
                rec(ret | (1 << i), ans, cnt-1, limit, i + 1);
            }
        }
    }

    private static String convert(int input) {
        String h = String.valueOf(input & 15);
        String m = String.valueOf(input >> 4);
        return h + ":" + (m.length() == 1 ? ("0" + m) : m);
    }

    private static List<String> convert(List<Integer> input) {
        List<String> ret = new ArrayList<>();
        for(int n : input) {
            ret.add(convert(n));
        }
        return ret;
    }

    public static List<String> readBinaryWatch(int num) {
        List<Integer> ans = new ArrayList<>();
        rec(0, ans, num, 10, 0);
        //System.out.println(ans);
        return convert(ans);
    }

    public static void main(String[] args) {
        readBinaryWatch(5);
    }
}
