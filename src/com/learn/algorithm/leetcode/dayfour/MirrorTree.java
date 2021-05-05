package com.learn.algorithm.leetcode.dayfour;

import com.learn.algorithm.utils.ListNode;
import com.learn.algorithm.utils.ListNodeBuilder;
import com.learn.algorithm.utils.TreeNode;
import com.learn.algorithm.utils.TreeNodeBuilder;

import java.util.Stack;

/**
 * create by shuaizhimin
 * create on 2021/5/4 13:31
 * 二叉树镜像定义： 对于二叉树中任意节点 rootroot ，设其左 / 右子节点分别为 left, rightleft,right ；则在二叉树的镜像中的对应 rootroot 节点，其左 / 右子节点分别为 right, leftright,left
 */
public class MirrorTree {
    public static void main(String args[]) {
       TreeNode node=TreeNodeBuilder.build();
       TreeNode node1=TreeNodeBuilder.build();
       TreeNode nodea=mirrorTree(node);
       TreeNode nodeb=mirrorTree2(node1);
       TreeNodeBuilder.show(nodea);
       TreeNodeBuilder.show(nodeb);
    }

    /**
     * 递归
     * @param root
     * @return
     */
    public static TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left=mirrorTree(root.right);
        root.right=mirrorTree(tmp);
        return root;
    }

    /**
     * 辅助栈
     * @param root
     * @return
     */
    public static TreeNode mirrorTree2(TreeNode root) {
       if (root==null) return null;
        Stack<TreeNode> stack=new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node=stack.pop();
            if(node.left!=null){
                stack.add(node.left);
            }
            if(node.right!=null){
                stack.add(node.right);
            }
            TreeNode temp=node.left;
            node.left=node.right;
            node.right=temp;
        }
        return root;
    }


}
