package com.learn.algorithm.leetcode.daytwo;

import com.learn.algorithm.utils.ListNode;
import com.learn.algorithm.utils.ListNodeBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * create by shuaizhimin
 * create on 2021/5/2 14:44
 * 从尾到头打印链表
 */
public class ReversePrint {
    public static ArrayList<Integer> tmp = new ArrayList<Integer>();

    public static void main(String args[]) {
        int[] a = reversePrint(ListNodeBuilder.build());
        System.out.println("" + Arrays.toString(a));

        int[] b = reversePrint1(ListNodeBuilder.build());
        for (int i = 0; i < b.length; i++) {
            System.out.println("遍历2: " + b[i]);
        }
    }

    /**
     * 递归法
     * 先走至链表末端，回溯时依次将节点值加入列表
     *
     * @param head
     * @return
     */
    public static int[] reversePrint1(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }

    public static void recur(ListNode head) {
        if (head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }


    /**
     * 用栈的方式后进先出
     * 时间复杂度O(n)
     * 空间复杂度O(n)
     *
     * @param head
     * @return
     */
    public static int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = stack.pop().val;
        }
        return a;
    }
}
