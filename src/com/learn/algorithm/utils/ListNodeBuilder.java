package com.learn.algorithm.utils;


/**
 * create by shuaizhimin
 * create on 2021/4/30 16:01
 *
 * 单链表构建
 *
 */
public class ListNodeBuilder {

    /**
     * 链表4->5->1->9
     * @return
     */
    public static ListNode build(){
        ListNode nodeB=new ListNode(4);
        ListNode node3=new ListNode(5);
        ListNode node4=new ListNode(1);
        ListNode node5=new ListNode(9);
        nodeB.next=node3;
        node3.next=node4;
        node4.next=node5;
        System.out.println("当前构建的单链表:");
        printListNode(nodeB);
        return nodeB;
    }

    /**
     * 链表1->3->7->2
     * @return
     */
    public static ListNode build1(){
        ListNode nodeB=new ListNode(1);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(7);
        ListNode node5=new ListNode(2);
        nodeB.next=node3;
        node3.next=node4;
        node4.next=node5;
        System.out.println("当前构建的单链表:");
        printListNode(nodeB);
        return nodeB;
    }

    /**
     * 打印单链表
     */
    public static void printListNode(ListNode current){
        while (current != null)
        {
            if (current.next == null)
                System.out.println(current.val);
            else
                System.out.print(current.val + " -> ");

            current = current.next;
        }
    }
}
