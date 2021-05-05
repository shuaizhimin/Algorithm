package com.learn.algorithm.leetcode.dayfour;

import java.util.Stack;

/**
 * create by shuaizhimin
 * create on 2021/5/4 16:15
 * <p>
 * 栈
 * peek() 返回栈顶但不移除
 * pop()  返回栈顶并移除
 */
public class MinStack {
    //使用B作为辅助栈
    Stack<Integer> A, B;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void push(int x) {
        A.add(x);
        //如果辅助栈顶大于x
        if (B.isEmpty() || B.peek() >= x) {
            B.add(x);
        }
    }

    public void pop() {
        if(A.pop().equals(B.peek())){
            B.pop();
        }
    }

    public int top() {
       return A.peek();
    }

    public int min() {
        return B.peek();
    }
}
