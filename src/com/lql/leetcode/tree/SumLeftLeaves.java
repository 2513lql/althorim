package com.lql.leetcode.tree;

/**
 * Created by LQL on 2016/11/28.
 */
public class SumLeftLeaves {

    public static int sumOfLeftLeaves(TreeNode root) {

        if (root == null) return 0;

        if (root.left != null && root.left.left == null && root.left.right == null)
            return root.left.val + sumOfLeftLeaves(root.right);
        else{
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
    }


    public static void main(String[] args) {
        System.out.println(sumOfLeftLeaves(TreeUtil.generateTree2()));
    }

}
