package com.lql.tree;

/**
 * Created by LQL on 2017/5/9.
 */
public class MaxDistanceBTree {


    class BTreeNode{
        public int val;
        BTreeNode left;
        BTreeNode right;

        int maxLeft;
        int maxRight;
    }

    public static int maxDistance = 0;

    public static void getMaxDistance(BTreeNode root){

        if (root == null){
            return;
        }
        if (root.left == null){
            root.maxLeft = 0;
        }
        if (root.right == null){
            root.maxRight = 0;
        }
        if (root.left != null){
            getMaxDistance(root.left);
        }
        if (root.right != null){
            getMaxDistance(root.right);
        }
        if (root.left != null){
            root.maxLeft = (root.left.maxLeft > root.left.maxRight ? root.left.maxLeft : root.left.maxRight) + 1;
        }
        if (root.right != null){
            root.maxRight = (root.right.maxRight > root.right.maxRight ? root.right.maxRight : root.right.maxLeft) + 1;
        }

        if (root.maxLeft + root.maxRight > maxDistance){
            maxDistance = root.maxLeft + root.maxRight;
        }
    }


}
