package com.lql.tree;

import com.lql.leetcode.tree.*;

/**
 * Created by LQL on 2017/3/24.
 *
 * 二叉排序树
 *
 */
public class SortBinaryTree {

    private static TreeNode root = null;
    public static void insert(TreeNode node){

        if (root == null){
            root = node;
        }
        else {
            TreeNode current = root;
            TreeNode parent = null;
            while (true){
                parent = current;
                if (node.val < current.val){
                    current = current.left;
                    if (current == null){
                        parent.left = node;
                        return;
                    }
                }else {
                    current = current.right;
                    if (current == null){
                        parent.right = node;
                        return;
                    }
                }
            }
        }
    }


    public static void buildSortBinaryTree(int[] A){
        for (int i = 0; i < A.length;i++){
            insert(new TreeNode(A[i]));
        }
    }

    public static void main(String[] args) {
        int[] A = {6,5,2,9,10};
        buildSortBinaryTree(A);
        System.out.println(root.val);
    }

}
