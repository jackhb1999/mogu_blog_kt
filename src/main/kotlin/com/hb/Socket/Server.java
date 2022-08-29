package com.hb.Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class Server {
    public static void main(String[] args) {
        try {
//            byte[] byteArray = new byte[2048];
            ServerSocket serverSocket = new ServerSocket(8088);
            System.out.println("accept阻塞开始 = " + System.currentTimeMillis());
            Socket socket = serverSocket.accept(); //呈阻塞效果
            System.out.println("accept阻塞结束 = " + System.currentTimeMillis());
            TimeUnit.MILLISECONDS.sleep(Integer.MAX_VALUE);
            serverSocket.close();
            System.out.println("server端运行结束 = " + System.currentTimeMillis());
        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
