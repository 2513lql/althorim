package com.lql.tree;

/**
 * Created by LQL on 2017/5/11.
 * 二叉树镜像
 */
public class BinaryMirror {


    public static void getMirror(TreeNode root){

        if (root == null){
            return;
        }
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        getMirror(root.left);
        getMirror(root.right);
    }



    public static boolean subStruct(TreeNode root,TreeNode root1){
        if (root1 == null){
            return true;
        }
        if (root == null){
            return false;
        }
        if (root.val == root1.val){
            return subStruct(root.left,root1.left) && subStruct(root.right,root1.right);
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
        TreeNode root = BinaryTreeUtil.generateBinaryTree();
//        getMirror(root);
//        TreeTravel.levelTravel(root);
        System.out.println(subStruct(root,BinaryTreeUtil.generateBinaryTree2()));

    }
}
