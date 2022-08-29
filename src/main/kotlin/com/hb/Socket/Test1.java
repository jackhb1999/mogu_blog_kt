package com.hb.Socket;

import java.io.IOException;
import java.net.Socket;

public class Test1 {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        try {
            socket = new Socket("www.csd2353wretwertertertn.net",80);
            System.out.println("socket连接成功");
        }catch(IOException e){
            System.out.println("socket连接失败");
            e.printStackTrace();
        }finally{
            socket.close();
        }
    }
}
