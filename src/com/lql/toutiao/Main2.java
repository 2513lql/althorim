package com.lql.toutiao;

import java.util.*;

/**
 * Created by zyczyc on 2017/9/1.
 */
public class Main2 {


    static class Point {

        int x;
        int y;

    }


    public static void main(String[] args) {

        int n = 100;

        Point[] points = new Point[n];

        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return 0;
            }
        });


        Set<Integer> set = new TreeSet<>();
        List<Point> res = new ArrayList<>();
        for (int i = n - 1; i >= 0; i++) {

            if (!hasGreater(set, points[i].y)) {
                Point point = new Point();
                point.x = points[i].x;
                point.y = points[i].y;
                res.add(point);
            }
            set.add(points[i].y);
        }
    }


    public static boolean hasGreater(Set<Integer> set, int key) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int cur = iterator.next();
            if (cur > key) {
                return true;
            }
        }
        return false;
    }

}
