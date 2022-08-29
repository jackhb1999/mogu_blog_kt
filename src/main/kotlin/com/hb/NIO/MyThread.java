package com.hb.NIO;

import java.util.concurrent.TimeUnit;

public class MyThread extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("run threadName = " + currentThread().getName() + " begin");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("run threadName = " + currentThread().getName() + " end");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
