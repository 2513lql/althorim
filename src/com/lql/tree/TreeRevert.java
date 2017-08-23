package com.lql.tree;

/**
 * Created by LQL on 2017/3/3.
 *
 * 二叉树转置
 */
public class TreeRevert {

    public static void revert(TreeNode root){

        if (root == null){
            return;
        }
        else {
            TreeNode cur = root.left;
            root.left = root.right;
            root.right = cur;
            revert(root.left);
            revert(root.right);
        }
    }
    public static void main(String[] args) {
        TreeNode root = BinaryTreeUtil.generateBinaryTree();
        revert(root);
        TreeLevelTravel.levelsTravel(root);
    }

}
