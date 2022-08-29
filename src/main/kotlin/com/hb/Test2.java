package com.hb;

public class Test2 {
    public static void main(String[] args) {
        Thread myThread = new Thread(){
            @Override
            public void run() {
                System.out.println("运行run!");
            }
        };
        myThread.start();

    }
}
