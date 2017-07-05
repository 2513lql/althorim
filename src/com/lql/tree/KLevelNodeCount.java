package com.lql.tree;

/**
 * Created by LQL on 2017/5/10.
 */
public class KLevelNodeCount {


    public static int count = 0;

    public static void klevelNodeCount(TreeNode root , int k,int level){
        if (k <= 0){
            return;
        }
        if (root == null){
            return;
        }
        if (level == k){
            count++;
        }
        klevelNodeCount(root.left,k,level + 1);
        klevelNodeCount(root.right,k,level+1);
    }

    public static void main(String[] args) {
        klevelNodeCount(BinaryTreeUtil.generateBinaryTree(),1,1);
        System.out.println(count);
    }

}
