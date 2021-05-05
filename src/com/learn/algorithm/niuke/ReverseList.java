package com.learn.algorithm.niuke;

import com.learn.algorithm.utils.ListNode;
import com.learn.algorithm.utils.ListNodeBuilder;

/**
 * create by shuaizhimin
 * create on 2021/5/5 2:46
 * 反转链表
 */
public class ReverseList {
    public static void main(String args[]) {
        ListNode a = ListNodeBuilder.build();
        ListNode b=reverseList(a);
        ListNodeBuilder.printListNode(b);
    }

    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        // pre->head->next1->next2
        // next2->next1->head->pre
        while (curr!=null){
            //存储next节点.保证单链表不会失去head节点的原next节点而断裂
            ListNode next=curr.next;
            //翻转next->pre节点
            //让head从指向next变成执行pre
            curr.next=prev;
            //head指向pre后，就继续依次反转下一个节点
            //让pre，head，next依次向后移动一个节点，继续下一次的指针反转
            prev=curr;
            //next指向当前节点
            curr=next;
        }
        return prev;
    }

}
