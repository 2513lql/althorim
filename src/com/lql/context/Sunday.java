package com.lql.context;

/**
 * Created by LQL on 2017/1/13.
 *
 * 字符串匹配算法
 *
 */
public class Sunday {



    public static int isContainsSubStr(String str1,String subStr){

        int index = -1;
        if (str1 == null || subStr == null){
            return -1;
        }
        if ("".equals(str1) || "".equals(subStr)){
            return -1;
        }
        int i = 0,j = 0;
        int length1 = str1.length();
        int length2 = subStr.length();
        if (length1 < length2) return index;
        int pos = length2;
        while (i < length1 && j < length2){

            char c1 = str1.charAt(i);
            char c2 = subStr.charAt(j);
            if (c1 == c2){
                i++;
                j++;
            }else{
                if (pos >= length1){
                    return -1;
                }else {
                    int k = length2 - 1;
                    char tmp = str1.charAt(pos);
                    for (; k >= 0;k--){
                        char tmp2 = subStr.charAt(k);
                        if (tmp == tmp2){
                            i = pos - k;
                            j = 0;
                            pos = i + length2;
                            break;
                        }
                    }
                    if (k < 0){
                        i = pos + 1;
                        j = 0;
                        pos = i+ length2;
                    }
                }
            }
        }
        if (j >= length2){
            return pos - length2;
        }
        return index;
    }


    public static void main(String[] args) {
        System.out.println(isContainsSubStr("substring searching algorithm search","seach"));
    }

}
