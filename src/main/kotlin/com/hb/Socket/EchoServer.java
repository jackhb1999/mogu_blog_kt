package com.hb.Socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws Exception {
        // 定义 ServerSocket 对象；此服务器在8888端口上进行监听
        ServerSocket server = new ServerSocket(8888);
        // 定义一个标记位
        boolean f = true;
        while (f){
            System.out.println("服务器运行中，等待客户端连接");
            // 定义客户端；接收客户端连接
            Socket client = server.accept();
            // 用于接收客户端发来的信息；得到客户端的输入信息
            BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
            // 定义输出流；实例化客户端输出流
            PrintStream out = new PrintStream(client.getOutputStream());
            // 标志位，表示一个客户端是否操作完成
            boolean flag = true;
            while (flag){
                // 此处不断地接收信息
                String str = buf.readLine();
                System.out.println("客户端：" + str);
                // 判断输入的信息是否为空
                if (str == null || "".equals(str)){
                    // 客户端操作结束
                    flag = false;
                }else{
                    if ("bye".equals(str)){
                        // 客户端操作结束
                        flag = false;
                    }else{
                        out.print("ECHO" + str);
                    }
                }
            }
            out.close();
            client.close();
        }
        server.close();
    }
}
