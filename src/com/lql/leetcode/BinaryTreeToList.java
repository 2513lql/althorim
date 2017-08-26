package com.lql.leetcode;

import com.lql.tree.TreeNode;

/**
 * Created by zyczyc on 2017/8/26.
 *
 * 二叉排序树转双向链表
 *
 */
public class BinaryTreeToList {


    public static TreeNode binaryTreeToList(TreeNode root){


        TreeNode lastNode = null;

        helper(root,lastNode);

        while (lastNode != null && lastNode.left != null){
            lastNode = lastNode.left;
        }
        return lastNode;

    }


    public static void helper(TreeNode root,TreeNode lastNode){

        if (root == null){
            return;
        }

        TreeNode cur = root;

        if (root.left != null){
            helper(root.left,lastNode);
        }

        cur.left = lastNode;

        if (lastNode != null){
            lastNode.right = cur;
        }
        lastNode = cur;
        if (root.right != null){
            helper(root.right,lastNode);
        }




    }


    public static void main(String[] args) {

    }

}
