package com.learn.algorithm.leetcode.dayone;

import com.learn.algorithm.utils.ListNode;

/**
 * create by shuaizhimin
 * create on 2021/4/30 15:50
 *
 *
 */
public class ConvertListNode {

    public static void main(String args[]) {
        //ListNode a=reverseList(nodeA,nodeB);
        System.out.println("查找公共节点:=======>");
    }


    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


}
