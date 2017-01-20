package com.lql.sort;

/**
 * Created by LQL on 2017/1/9.
 *
 * 荷兰国旗问题
 */
public class FlagColor {


    public static String getResult(String flag){

        char[] flagChars  = flag.toCharArray();
        int beign = 0,cur = 0,end = flag.length() -1;
        while (cur <= end){

            char beginC = flagChars[beign];
            char curC = flagChars[cur];
            char endC = flagChars[end];
            if (curC == 'R'){
                swap(flagChars,beign,cur);
                beign++;
                cur++;
            }else if (curC == 'B'){
                swap(flagChars,end,cur);
                end--;
                cur++;
            }else{
                cur++;
            }
        }
        String res="";
        for (int i = 0;i < flagChars.length;i++){
            res += flagChars[i];
        }
        return res;
    }

    public static void swap(char[] chars,int i,int j){
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }

    public static void main(String[] args) {
        System.out.println(getResult("BBRRWBRR"));
    }
}
