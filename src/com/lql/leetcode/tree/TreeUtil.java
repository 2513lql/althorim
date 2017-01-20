package com.lql.leetcode.tree;

/**
 * Created by LQL on 2016/11/28.
 */
public class TreeUtil {

    public static TreeNode generateTree(){

        TreeNode root = new TreeNode();
        root.val = 3;
        TreeNode left1 = new TreeNode();
        left1.val = 9;
        TreeNode right1 = new TreeNode();
        right1.val = 20;
        root.left = left1;
        root.right = right1;

        TreeNode left2 = new TreeNode();
        left2.val = 15;
        TreeNode right2 = new TreeNode();
        right2.val = 7;
        right1.left = left2;
        right1.right = right2;

        return root;

    }

    public static TreeNode generateTree2(){

        TreeNode root = new TreeNode();
        root.val = 1;
        TreeNode left1 = new TreeNode();
        left1.val = 2;
        TreeNode right1 = new TreeNode();
        right1.val = 3;
        root.left = left1;
        root.right = right1;

        TreeNode left2 = new TreeNode();
        left2.val = 4;
        TreeNode right2 = new TreeNode();
        right2.val = 5;
        left1.left = left2;
        left1.right = right2;

        TreeNode left3 = new TreeNode();
        left3.val = 6;
        TreeNode right3 = new TreeNode();
        right3.val = 7;
        right1.left = left3;
        right1.right = right3;
        return root;

    }

}
