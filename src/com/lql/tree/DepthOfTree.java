package com.lql.tree;

/**
 * Created by LQL on 2017/5/10.
 */
public class DepthOfTree {


    public static int getDepth(TreeNode root){

        if (root == null) return 0;

        int left = getDepth(root.left);
        int right = getDepth(root.right);
        return (left>right ? left:right) + 1;
    }

    public static void main(String[] args) {
        System.out.println(getDepth(BinaryTreeUtil.generateBinaryTree()));
    }
}
