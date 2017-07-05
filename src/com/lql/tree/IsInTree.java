package com.lql.tree;

/**
 * Created by LQL on 2017/4/13.
 */
public class IsInTree {


    public static boolean isIn(TreeNode root,int k){


        if (root == null){
            return false;
        }
        if (root.val == k){return true;}

        return isIn(root.left , k) || isIn(root.right,k);
    }


    public static void main(String[] args) {
        System.out.println(isIn(BinaryTreeUtil.generateBinaryTree(),0));
    }
}
