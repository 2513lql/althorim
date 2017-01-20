package com.lql.leetcode;

/**
 * Created by LQL on 2016/12/4.
 */
public class AddString {

    public static String addStrings(String num1, String num2) {
        String result = "";
        int len1 = num1.length();
        int len2 = num2.length();
        int i = len1 - 1;
        int j = len2 - 1;
        int carry = 0;
        int cur1 = 0;
        int cur2 = 0;
        while (i >= 0 && j >= 0){
            cur1 = num1.charAt(i) - '0';
            cur2 = num2.charAt(j) - '0';
            result += (cur1 + cur2 + carry) % 10;
            carry = (cur1 + cur2 + carry) / 10;
            i--;
            j--;
        }
        while (i >= 0){
            cur1 = num1.charAt(i) - '0';
            result += (cur1 + carry) % 10;
            carry = (cur1 + carry) / 10;
            i--;
        }
        while (j >= 0){
            cur2 = num2.charAt(j) - '0';
            result += (cur2 + carry) % 10;
            carry = (cur2 + carry) / 10;
            j--;
        }
        if (carry > 0){
            result += carry;
        }

        StringBuffer res = new StringBuffer();
        for (int k = result.length() - 1;k >= 0;k--){
            char tmp = result.charAt(k);
            res.append(tmp);
        }
        return res.toString();

    }

    public static void main(String[] args) {
        System.out.println(addStrings("123","123000"));
    }

}
