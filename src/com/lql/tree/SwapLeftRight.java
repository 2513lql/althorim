package com.lql.tree;

/**
 * Created by LQL on 2017/4/13.
 */
public class SwapLeftRight {


    public static void swapRightLeft(TreeNode root){


        if (root == null){
            return;
        }

        swapRightLeft(root.left);
        swapRightLeft(root.right);

        TreeNode tmp = root.left;
        root.left=  root.right;
        root.right = tmp;
    }

    public static void preOrder(TreeNode root){
        if (root != null){
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }


    public static void main(String[] args) {
        TreeNode root =BinaryTreeUtil.generateBinaryTree();
        swapRightLeft(root);
        preOrder(root);
    }

}
