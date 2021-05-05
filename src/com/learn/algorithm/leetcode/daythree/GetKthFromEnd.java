package com.learn.algorithm.leetcode.daythree;

import com.learn.algorithm.utils.ListNode;
import com.learn.algorithm.utils.ListNodeBuilder;

/**
 * create by shuaizhimin
 * create on 2021/5/3 18:09
 * 链表中倒数第k个节点
 */
public class GetKthFromEnd {
    public static void main(String args[]) {
        ListNode a = ListNodeBuilder.build();
        ListNode b = getKthFromEnd(a, 2);
        ListNode c = getKthFromEnd1(a, 2);
        ListNodeBuilder.printListNode(b);
        ListNodeBuilder.printListNode(c);
    }


    /**
     * 使用双链表  前面的多走K步
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head, latter = head;
        for (int i = 0; i < k; i++) {
            former = former.next;
        }
        while (former != null) {
            latter = latter.next;
            former = former.next;
        }
        return latter;
    }


    public static ListNode getKthFromEnd1(ListNode head, int k) {
        ListNode temp = head, node = head, res = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        for (int i = 0; i < length - 1; i++) {
            if (i >= length - 1 - k) {
                res = node.next;
            } else {
                node = node.next;
            }
        }
        return res;


    }


}
