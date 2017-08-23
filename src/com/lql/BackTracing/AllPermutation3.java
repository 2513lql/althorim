package com.lql.BackTracing;

/**
 * Created by LQL on 2017/3/10.
 */
public class AllPermutation3 {



    public static void dfs(int cur,int n,char[] chars,char[] res,boolean[] isVisits){

        if (cur == n){
            StringBuffer buffer = new StringBuffer();
            for (int i = 0;i < n;i++){
                buffer.append(res[i]);
            }
            System.out.println(buffer);
        }else {
            for (int i = 0;i < n;i++){
                int c = chars[i];
                if (!isVisits[c]){
                    isVisits[c] = true;
                    res[cur] = (char)c;
                    dfs(cur + 1,n,chars,res,isVisits);
                    isVisits[c] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        String s = "ABC";
        char[] chars = s.toCharArray();
        char[] res = new char[3];
        boolean[] isVisits = new boolean[256];
        dfs(0,3,chars,res,isVisits);
    }


}
