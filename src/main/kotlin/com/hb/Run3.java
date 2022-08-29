package com.hb;

import java.util.concurrent.TimeUnit;

public class Run3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            new Thread() {
                public void run() {
                    try {
                        TimeUnit.SECONDS.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                };
            }.start();
        }
    }
}
