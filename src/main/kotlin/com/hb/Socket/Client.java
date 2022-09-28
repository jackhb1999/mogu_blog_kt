package com.hb.Socket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("client连接准备 = " + System.currentTimeMillis());
            Socket socket = new Socket("localhost", 8888);
            InputStream inputStream = socket.getInputStream();
           byte[] byteArray = new byte[1];
           int readLength = inputStream.read(byteArray);
           while (readLength != -1){
               String newString = new String(byteArray,0,readLength);
               System.out.println(newString);
               readLength = inputStream.read(byteArray);
           }
            System.out.println("E = " + System.currentTimeMillis());
           inputStream.close();
            socket.close();

        }catch(UnknownHostException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
