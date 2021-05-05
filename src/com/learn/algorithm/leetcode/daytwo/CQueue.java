package com.learn.algorithm.leetcode.daytwo;

import java.util.Deque;
import java.util.LinkedList;

/**
 * create by shuaizhimin
 * create on 2021/5/2 16:27
 * 用两个栈实现队列
 *
 * 属性
 * 队列：先进先出
 * 栈：后进先出
 *
 */
public class CQueue {
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public CQueue() {
        stack1=new LinkedList<>();
        stack2=new LinkedList<>();
    }

    /**
     * 插入元素
     * @param value
     */
    public void appendTail(int value) {

    }

    /**
     * 删除元素
     * @return
     */
    public int deleteHead() {
        return 0;
    }

}
