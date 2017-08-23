package com.lql.toutiao;


import java.util.*;

/**
 * Created by Administrator on 2017/3/30.
 */
public class Main {


    public static class Point{
        public int x;
        public int y;
    }

//   public static Point[] p = new Point[500001];

    public static void func(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
        Point[] p = new Point[n];
        for (int i = 0 ; i < n ;i++){
            Point point = new Point();
            point.x = scanner.nextInt();
            point.y = scanner.nextInt();
            p[i] = point;
        }

        Arrays.sort(p, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.x != p2.x){
                    return p1.x - p2.x;
                }
                return p1.y - p2.y;
            }
        });
        TreeSet<Integer> set = new TreeSet<>();
        ArrayList<Point> ans = new ArrayList<>();
        for (int i = n -1 ; i >=0 ;i--){

            if (set.floor(p[i].y) == set.last()){
                Point pp = new Point();
                pp.x = p[i].x;
                pp.y = p[i].y;
                ans.add(pp);
            }
            set.add(p[i].y);
        }
        Collections.sort(ans, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.x != p2.x){
                    return p1.x - p2.x;
                }
                return p1.y - p2.y;
            }
        });


        for (int i = 0 ; i < ans.size();i++){
            System.out.println(ans.get(i).x + " " + ans.get(i).y);
        }

        return;
    }


    public static void main(String[] args) {
        func();
    }

}
