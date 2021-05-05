package com.learn.algorithm.niuke;

import java.util.Stack;

/**
 * create by shuaizhimin
 * create on 2021/5/5 7:21
 * 用两个栈实现队列
 *
 * 队列 先进后出
 */
public class StackQueen {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack1.empty()&&stack2.empty()){
            throw new RuntimeException("Queue is empty!");
        }
        if(stack2.empty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

}
