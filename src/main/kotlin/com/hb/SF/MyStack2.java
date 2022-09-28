package com.hb.SF;

import java.util.Stack;

public class MyStack2 {
    // 正常栈
    private Stack<Integer> stackData;
    // 保存每一步的最小值
    private Stack<Integer> stackMin;

    public MyStack2(Stack<Integer> stackData, Stack<Integer> stackMin) {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newNum){
        if(this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        } else if (newNum < this.getmin()){
            
        }
    }

    public int getmin(){
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("Your stack is empty.");
        }
        return this.stackMin.peek();
    }
}
