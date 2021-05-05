package com.learn.algorithm.leetcode.dayfour;

import com.learn.algorithm.utils.ListNode;
import com.learn.algorithm.utils.ListNodeBuilder;

/**
 * create by shuaizhimin
 * create on 2021/5/4 2:30
 * 合并两个排序的链表
 */
public class MergeTwoLists {
    public static void main(String args[]) {
        ListNode a = ListNodeBuilder.build();
        ListNode b = ListNodeBuilder.build1();

        ListNode c = ListNodeBuilder.build();
        ListNode d = ListNodeBuilder.build1();

        ListNode e = mergeTwoLists(a, b);
        ListNode f = mergeTwoLists2(c, d);
        ListNodeBuilder.printListNode(e);
        ListNodeBuilder.printListNode(f);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0), cur = dum;
        while (l1 != null && l2 != null) {
            //l1后移以为
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;
    }


    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        //递归实现
        return recur(l1, l2);
    }

    public static ListNode recur(ListNode l1, ListNode l2){
        //是否为null判断
        if(l1 == null && l2 == null) return null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        //新建头结点
        ListNode head = null;

        //如果l1.val <= l2.val，那么头结点的值为l1.head的值，然后开始递归
        if(l1.val <= l2.val){
            head = new ListNode(l1.val);
            head.next = recur(l1.next, l2);
        }
        //否则，头结点的值为l2.head的值，然后开始递归
        else{
            head = new ListNode(l2.val);
            head.next = recur(l1, l2.next);
        }

        //返回该链表
        return head;
    }

}
