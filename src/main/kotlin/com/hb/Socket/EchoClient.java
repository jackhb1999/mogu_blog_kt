package com.hb.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",8888);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = new PrintStream(client.getOutputStream());
        BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
        boolean flag = true;
        while (flag){
            System.out.println("输入信息：");
            String str = input.readLine();
            out.println(str);
            if ("bye".equals(str)){
                flag = false;
            }else{
                String echo = buf.readLine();
                System.out.println(echo);
            }
            System.out.println("客户端：" + str);
        }
        client.close();
        buf.close();
    }
}
