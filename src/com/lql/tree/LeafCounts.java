package com.lql.tree;

/**
 * Created by LQL on 2017/5/10.
 */
public class LeafCounts {


    public static int getLeafCount(TreeNode root){

        if (root == null){
            return 0;
        }
        if (root.left == null && root.right ==null){
            return 1;
        }
        return getLeafCount(root.left) + getLeafCount(root.right);
    }

    public static void main(String[] args) {
        System.out.println(getLeafCount(BinaryTreeUtil.generateBinaryTree3()));
    }

}
