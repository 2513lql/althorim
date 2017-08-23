package com.lql.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Locale;

/**
 * Created by zyczyc on 2017/7/9.
 */
public class SocketClient {


    public void go() throws UnknownHostException, IOException{

        //向服务器端发送请求，服务器IP地址和服务器监听的端口号
        Socket client = new Socket("127.0.0.1", 4141);

        //通过printWriter 来向服务器发送消息
        PrintWriter printWriter = new PrintWriter(client.getOutputStream());
        System.out.println("连接已建立...");
        long T1 = System.currentTimeMillis();
        //发送消息
        printWriter.println("hello Server");
        printWriter.flush();
        //InputStreamReader是低层和高层串流之间的桥梁
        //client.getInputStream()从Socket取得输入串流
        InputStreamReader streamReader = new InputStreamReader(client.getInputStream());

        //链接数据串流，建立BufferedReader来读取，将BufferReader链接到InputStreamReder
        BufferedReader reader = new BufferedReader(streamReader);
        String advice = null;
        long T4 = 0l;
        try {
            advice = reader.readLine();
            T4 = System.currentTimeMillis();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] strings = advice.split(";");
        long T2 = Long.parseLong(strings[0]);
        long T3 = Long.parseLong(strings[1]);
        System.out.println(((T2 - T1) + (T4 - T3)) / 2);
        System.out.println();

        System.out.println("接收到服务器的消息 ："+advice);

        reader.close();
    }

    public static void main(String[] args) {
        SocketClient client = new SocketClient();
        try {
            client.go();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
