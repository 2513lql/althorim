package com.lql.offer;

/**
 * Created by LQL on 2017/5/21.
 * 翻转单词顺序
 */
public class ReverseWordSeq {

    public static void reverseWordsSeq(String str){

        char[] chars = str.toCharArray();
        for (int i = 0,j = chars.length - 1; i < j;i++,j--){
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
        }

        int pre = 0;
        for (int i = 0 ; i < chars.length;i++){
            if (chars[i] == ' '){
                int j = pre;
                int k = i - 1;
                while (j < k){
                    char tmp = chars[j];
                    chars[j] = chars[k];
                    chars[k] = tmp;
                    j++;
                    k--;
                }
                pre = i + 1;
            }
        }

        for (int end = chars.length - 1; pre < end;pre++,end--){
            char tmp = chars[pre];
            chars[pre] = chars[end];
            chars[end] = tmp;
        }

        System.out.println(new String(chars));
    }

    public static void leftRotate(String str,int k){

        char[] chars = str.toCharArray();
        for (int i = 0,j = chars.length - 1;i < j;i++,j--){
            char c = chars[i];
            chars[i] = chars[j];
            chars[j] = c;
        }
        k = k % chars.length;

        for (int i = 0,j = chars.length - k - 1;i < j;i++,j--){
            char c = chars[i];
            chars[i] = chars[j];
            chars[j] = c;
        }
        for (int i = chars.length - k,j = chars.length - 1; i < j;i++,j--){
            char c = chars[i];
            chars[i] = chars[j];
            chars[j] = c;
        }
        System.out.println(new String(chars));
    }

    public static void main(String[] args) {
        String str= "I am a student.";
//        reverseWordsSeq(str);

        String str2 = "abcdefg";
        leftRotate(str2,8);
    }
}
