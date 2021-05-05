package com.learn.algorithm.leetcode.dayfour;

import com.learn.algorithm.utils.ListNode;
import com.learn.algorithm.utils.ListNodeBuilder;
import com.learn.algorithm.utils.TreeNode;
import com.learn.algorithm.utils.TreeNodeBuilder;

/**
 * create by shuaizhimin
 * create on 2021/5/4 14:34
 * 对称二叉树
 */
public class IsSymmetric {
    public static void main(String args[]) {
        TreeNode a = TreeNodeBuilder.buildSymmetric();
        System.out.println(""+isSymmetric(a));

    }

    public static boolean isSymmetric(TreeNode root) {
        return root == null ? true : recur(root.left, root.right);
    }

    public static boolean recur(TreeNode L, TreeNode R) {
        if(L == null && R == null) return true;
        if(L == null || R == null || L.val != R.val) return false;
        return recur(L.left, R.right) && recur(L.right, R.left);
    }


}
