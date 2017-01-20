package com.lql.dynamic;

/**
 * Created by LQL on 2016/10/30.
 */
public class ZigZag {

    public static int longestZigZag(int[] seq){
        if (seq == null){
            return 0;
        }
        if (seq.length <= 1){
            return seq.length;
        }
        int[] dp = new int[seq.length];
        boolean[] isPosition = new boolean[seq.length];
        int[] pre = new int[seq.length];
        dp[0] = 1;
        pre[0] = 0;
        if (seq[1] - seq[0] < 0){
            isPosition[0] = false;
        }else if (seq[1] > seq[0]){
            isPosition[0] = true;
        }
        for (int i = 1; i < seq.length;i++){
            for (int j = 0 ; j < i ;j++){
                if (seq[i] > seq[j] && isPosition[j] == true){
                    if (dp[j] + 1 > dp[i]){
                        dp[i] = dp[j] + 1;
                        isPosition[i] = false;
                        pre[i] = j;
                    }
                }else if(seq[i] < seq[j] && isPosition[j] == false){
                    if (dp[j] + 1 > dp[i]){
                        dp[i] = dp[j] + 1;
                        isPosition[i] = true;
                        pre[i] = j;
                    }
                }
            }
        }
        return dp[seq.length - 1];
    }

    public static void main(String[] args) {
        int[] seq = {1,2};
        System.out.println(longestZigZag(seq));
    }
}
