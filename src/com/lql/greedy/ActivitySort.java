package com.lql.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * Created by zyczyc on 2017/7/2.
 *
 * 贪心算法解活动安排问题
 *
 */
public class ActivitySort {


    public static int activitySort(int day,Activity[] activities){


        Arrays.sort(activities, new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                return o1.end - o2.end;

            }
        });

        int count = 1;
        int end = activities[0].end;
        for (int i = 1; i < activities.length;i++){
            if (activities[i].start >= end){
                count++;
                end = activities[i].end;
            }
        }
        return count;
    }

    static class Activity{
        public int start;
        public int end;
    }


    public static void main(String[] args) {
        Activity[] activities = new Activity[5];
        for (int i = 0 ; i < activities.length; i++){
            Activity activity = new Activity();
            activity.start = i;
            activity.end = 5 - i;
            activities[i] = activity;
        }
        activitySort(5,activities);
    }


}
