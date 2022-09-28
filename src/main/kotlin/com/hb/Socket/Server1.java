package com.hb.Socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) throws IOException {
        StringBuffer buffer = new StringBuffer(10000000);
        for (int i = 0; i < 10000000; i ++){
            buffer.append("1");
        }
        buffer.append("end");
        System.out.println("Server填充完毕");
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        socket.setSendBufferSize(10000000);
        socket.setSoLinger(true,10);
        OutputStream out = socket.getOutputStream();
        out.write(buffer.toString().getBytes());
        long beginTime = 0;
        long endTime = 0;
        beginTime = System.currentTimeMillis();
        System.out.println("D = " + endTime);
        socket.close();
        endTime = System.currentTimeMillis();
        System.out.println("时间差：" + (endTime - beginTime));
        serverSocket.close();
    }
}
