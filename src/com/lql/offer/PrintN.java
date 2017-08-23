package com.lql.offer;

/**
 * Created by LQL on 2017/3/30.
 *
 * 打印1-n所有的数
 *
 */
public class PrintN {

    public static void printN(int n){

        char[] numbers = new char[n];
        for (int i = 0 ; i < n;i++){
            numbers[i]='0';
        }
        while (!increment(numbers)){
            printNumber(numbers);
        }
    }

    private static boolean increment(char[] numbers) {

        boolean isOverFlow = false;
        int takeOver = 0;
        int length = numbers.length - 1;
        for (int i = length;i >= 0 ;i--){

            int nSum = numbers[i] - '0' + takeOver;

            if (i == length){
                nSum++;
            }

            if (nSum >= 10){
                if (i == 0){
                    isOverFlow = true;
                    break;
                }else {
                    takeOver = 1;
                    nSum -= 10;
                    numbers[i] = (char) (nSum + '0');
                }
            }else {
                numbers[i] = (char)(nSum + '0');
                break;
            }
        }
        return isOverFlow;
    }

    private static void printNumber(char[] numbers){

        int flag = 0;
        for (int i = 0; i < numbers.length;i++){
            if (numbers[i] != '0'){
                flag = 1;
            }
            if (flag == 1){
                System.out.print(numbers[i]);
            }
        }
        System.out.println();
    }


    private static void dfs(int n,int cur,char[] numbers){
        if (cur == n){
            printNumber(numbers);
        }else {
            for (int i = 0; i < 10;i++){
                numbers[cur] =(char) (i+'0');
                dfs(n,cur+1,numbers);
            }
        }
    }
    public static void main(String[] args) {
//        char[] numbers = {'0','0','1','0','2'};
        int n =3;
        char[] numbers = new char[3];
//        printN(3);
        dfs(3,0,numbers);
    }

}
