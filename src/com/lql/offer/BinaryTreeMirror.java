package com.lql.offer;

import com.lql.tree.TreeNode;

/**
 * Created by zyczyc on 2017/8/13.
 *
 * 二叉树镜像
 */
public class BinaryTreeMirror {


    public static void binaryTreeMirror(TreeNode root){

        if (root == null){
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        binaryTreeMirror(root.left);
        binaryTreeMirror(root.right);
    }


}
