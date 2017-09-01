package com.lql.tree;

/**
 * Created by LQL on 2017/3/13.
 */
public class CommonAncestor {

    public static TreeNode commonAncestor(TreeNode root,int A,int B){

        if (root == null){
            return null;
        }

        if (root.val == A || root.val == B){
            return root;
        }
        TreeNode left = commonAncestor(root.left,A,B);
        TreeNode right = commonAncestor(root.right,A,B);
        if (left != null && right !=null){
            return root;
        }else {
            return left != null ? left : right;
        }
    }
    public static void main(String[] args) {
        System.out.println(commonAncestor(BinaryTreeUtil.generateBinaryTree(),4,9).val);
    }
}
