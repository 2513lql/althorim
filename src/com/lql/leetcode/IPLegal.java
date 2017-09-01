package com.lql.leetcode;

/**
 * Created by LQL on 2017/3/5.
 */
public class IPLegal {


    public static boolean isIpLegal(String ip){

        String[] strings = ip.split("\\.");
        if (strings.length < 4){
            return false;
        }else {
            for (String item : strings){
                if (item.length() > 3 || item.length() == 0){
                    return false;
                }else {
                    char[] chars = item.toCharArray();
                    for (int i = 0; i < chars.length;i++){
                        int c = chars[i] - '0';
                        if (c < 0 || c > 9){
                            return false;
                        }
                    }
                    int intItem = Integer.parseInt(item);
                    if (intItem > 255 || intItem < 0){
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        String ip = "2,6.1.132.4";
        System.out.println(isIpLegal(ip));
    }

}
