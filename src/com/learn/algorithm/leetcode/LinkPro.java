package com.learn.algorithm.leetcode;

import com.learn.algorithm.utils.ListNode;


/**
 * create by shuaizhimin
 * create on 2021/4/27 16:42
 * 删除链表倒数第N个节点
 */
public class LinkPro {
    public static ListNode nodeA;
    public static ListNode nodeB;

    public static void main(String args[]) {
        buildListNode();
        ListNode a=getIntersectionNode(nodeA,nodeB);
        System.out.println("查找公共节点:=======>");
        print(a);
    }



    public static void buildListNode(){
        ListNode nodeA=new ListNode(4);
        ListNode node1=new ListNode(1);

        ListNode nodeB=new ListNode(5);
        ListNode node3=new ListNode(0);
        ListNode node4=new ListNode(1);

        ListNode node5=new ListNode(8);
        ListNode node6=new ListNode(4);
        ListNode node7=new ListNode(5);

        nodeA.next=node1;
        node1.next=node5;
        nodeB.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;

    }



    /**
     * 查找第一个公共节点
     * @param headA
     * @param headB
     * @return
     */

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;
        while (A != B) {
            A = A != null ? A.next : headB;
            B = B != null ? B.next : headA;
        }
        return A;
    }

    private static void print(ListNode current) {
        if(current==null) {
            return ;
        }
        System.out.println(current.val);
    }


}
