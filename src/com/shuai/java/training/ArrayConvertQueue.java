package com.shuai.java.training;

/**
 * 作者: shuaizhimin
 * 描述: 数组转换成队列
 * 日期: 2017-11-09
 * 时间: 13:09
 * 版本:
 */
public class ArrayConvertQueue {
    private int maxSize;//数组大小
    private long[] queArray;
    private int front;//队头
    private int rear;//队尾
    private int nItems;//数据项个数

    public ArrayConvertQueue(int s){
        maxSize = s;
        queArray = new long[s];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j){
        if(rear == maxSize-1)//循环
            rear = -1;
        queArray[++rear] = j;
        nItems++;
    }
    //remove Queue
    public long remove(){
        long temp = queArray[front++];
        if(front == maxSize)
            front = 0;
        nItems--;

        return temp;
    }

    public long peedFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return nItems == 0;
    }

    public boolean isFull(){
        return nItems == maxSize;
    }

    public int ItemSize(){
        return nItems;
    }


    public static void main(String[] args) {
        ArrayConvertQueue theQueue = new ArrayConvertQueue(5);
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);// rear 3 nItems 4

        //查看栈
        System.out.println("查看队列：" + theQueue.peedFront());

        theQueue.remove();
        theQueue.remove();
        theQueue.remove();// front 3 nItems 1

        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);// rear 2 nItems 5

        while(!theQueue.isEmpty()){
            System.out.println(theQueue.remove());
        }
    }

}
