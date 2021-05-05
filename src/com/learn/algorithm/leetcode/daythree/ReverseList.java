package com.learn.algorithm.leetcode.daythree;

import com.learn.algorithm.utils.ListNode;
import com.learn.algorithm.utils.ListNodeBuilder;

import java.util.Stack;

/**
 * create by shuaizhimin
 * create on 2021/5/3 21:03
 * 反转链表
 *
 *
 *
 */
public class ReverseList {
    public static void main(String args[]) {
        ListNode a = ListNodeBuilder.build();
        ListNode d = ListNodeBuilder.build();
        ListNode b=reverseList(a);
        ListNode c=reverseList1(d);
        ListNodeBuilder.printListNode(b);
        ListNodeBuilder.printListNode(c);
    }

    /**
     * 使用链表的方式
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        // prev->curr
        // prev->curr
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }

    /**
     * 递归解决
     * @param head
     * @return
     */
    public static ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
