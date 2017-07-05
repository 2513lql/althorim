package com.lql.Tencent;

import javax.net.ssl.SSLContext;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by LQL on 2017/4/2.
 */
public class Main {


    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        String nStr = scanner.nextLine();
//        int n = Integer.parseInt(nStr);
//
//        Set<String> set = new HashSet<>();
//        for (int i = 0; i < n;i++){
//            String str = scanner.nextLine();
//            set.add(str);
//        }
//
//        String mStr = scanner.nextLine();
//        int m = Integer.parseInt(mStr);
//        String[] operations = new String[m];
//        for (int i = 0 ; i < m;i++){
//            String str = scanner.nextLine();
//            operations[i] = str;
//        }
//
//        for (int i = 0 ; i < operations.length;i++){
//
//            String[] strings = operations[i].split(" ");
//            if (strings[0].equals("query")){
//
//
//
//            }
//        }

        String str1 = "hello";
        String str2 = "he" + new String("llo");
        System.out.println(str1 == str2);

    }

    public static boolean isChinaPhoneLegal(String str) throws PatternSyntaxException {
        String regExp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static int query(Set<String> set){

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String cur = iterator.next();
        }
        return 0;
    }

}
