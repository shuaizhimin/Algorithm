package com.learn.algorithm.leetcode.daythree;

import com.learn.algorithm.utils.ListNode;
import com.learn.algorithm.utils.ListNodeBuilder;

import java.util.Arrays;

/**
 * create by shuaizhimin
 * create on 2021/5/3 15:41
 * 删除链表的节点
 */
public class DeleteNode {

    public static void main(String args[]) {
        ListNode a = ListNodeBuilder.build();
        ListNode b = deleteNode(a, 1);
        ListNode c = deleteNode1(a, 1);
        ListNodeBuilder.printListNode(b);
        ListNodeBuilder.printListNode(c);
    }


    /**
     * 双链表解决
     * 时间复杂度O(n)
     *
     * @param head 链表
     * @param val  要删除的节点
     * @return
     */
    public static ListNode deleteNode(ListNode head, int val) {
        //特殊处理:当删除的为头节点时，直接返回head.next
        if (head.val == val)
            return head.next;
        ListNode pre = head, cur = head.next;
        //未定位到比遍历节点
        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if (cur != null) {
            pre.next = cur.next;
        }
        return head;
    }


    /**
     * 单链表方式
     *
     * @param head
     * @param val
     * @return
     */
    public static ListNode deleteNode1(ListNode head, int val) {
        //特殊处理:当删除的为头节点时，直接返回head.next
        if (head.val == val)
            return head.next;

        ListNode cur=head;
        while (cur.next!=null&&cur.next.val!=val){
            cur=cur.next;
        }
        if(cur.next!=null){
            cur.next=cur.next.next;
        }
        return head;
    }


}
