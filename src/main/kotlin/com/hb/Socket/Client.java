package com.hb.Socket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("client连接准备 = " + System.currentTimeMillis());
            Socket socket = new Socket("localhost", 8088);
            System.out.println("socket连接结束 = " + System.currentTimeMillis());
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("111".getBytes());
            outputStream.write("11111111".getBytes());
            outputStream.write("1111111111111111".getBytes());
            TimeUnit.SECONDS.sleep(500000);

            socket.close();

        }catch(UnknownHostException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
