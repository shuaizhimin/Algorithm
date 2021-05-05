package com.learn.algorithm.leetcode.dayfive;

import com.learn.algorithm.utils.ListNode;
import com.learn.algorithm.utils.ListNodeBuilder;

import java.util.Deque;
import java.util.LinkedList;

/**
 * create by shuaizhimin
 * create on 2021/5/5 23:32
 * 删除倒数第K个节点
 */
public class RemoveNthFromEnd {
    public static void main(String args[]) {
        ListNode a = ListNodeBuilder.build();
        ListNode d = ListNodeBuilder.build();
        ListNode e = ListNodeBuilder.build();
        ListNode b = removeNthFromEnd(a, 2);
        ListNode c = removeNthFromEnd1(d, 2);
        ListNode f = removeNthFromEnd2(e, 2);
        ListNodeBuilder.printListNode(b);
        ListNodeBuilder.printListNode(c);
        ListNodeBuilder.printListNode(f);

    }


    /**
     * 使用栈的方式
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd2(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        Deque<ListNode> stack = new LinkedList<ListNode>();
        ListNode cur = dummy;
        while (cur!=null){
            stack.push(cur);
            cur=cur.next;
        }
        for(int i=0;i<n;i++){
            stack.pop();
        }

        ListNode pre=stack.peek();
        pre.next=pre.next.next;
        return dummy.next;
    }

    /**
     * 双指针方式
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd1(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode faster=head,latter=dummy;
        for(int i=0;i<n;i++){
            faster=faster.next;
        }
        while (faster!=null){
            faster=faster.next;
            latter=latter.next;
        }
        latter.next=latter.next.next;
        return dummy.next;
    }


    /**
     * 计算长度
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = getLength(head);
        ListNode curr = dummy;
        for (int i = 1; i < length - n + 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        ListNode ans = dummy.next;
        return ans;
    }

    /**
     * 获取单链表的长度
     *
     * @param head
     * @return
     */
    public static int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }


}
