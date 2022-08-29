package com.hb;

public class BServer1 extends AServer implements Runnable {

    public void b_save_method(){
        System.out.println("b中保存数据的方法被执行");
    }

    @Override
    public void run() {
        b_save_method();
    }
}
