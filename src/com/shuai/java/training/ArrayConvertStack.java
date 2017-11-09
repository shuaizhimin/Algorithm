package com.shuai.java.training;

/**
 * 作者: shuaizhimin
 * 描述: 数组转换成栈
 * 日期: 2017-11-09
 * 时间: 12:58
 * 版本:
 */
public class ArrayConvertStack {

    private int maxSize;
    private long[] stackArray;
    private int top;

    public ArrayConvertStack(int max){
        stackArray = new long[max];
        top = -1;//空栈
    }
    /**
     * 入栈
     * @param j
     */
    public void push(long j){
        stackArray[++top]=j;
    }

    /**
     * 出栈
     */
    public long pop(){
        return stackArray[top--];
    }

    /**
     * 查看栈
     * @return
     */
    public long peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == (maxSize -1);
    }


    public static void main(String[] args) {
        //创建栈
        ArrayConvertStack stack = new ArrayConvertStack(10);
        //入栈
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        //查看栈
        System.out.println("查看栈：" + stack.peek());

        //出栈
        while (!stack.isEmpty()) {
            System.out.println("出栈" + stack.pop());
        }
    }


}
