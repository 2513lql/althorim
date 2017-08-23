package com.lql.offer;

/**
 * Created by LQL on 2017/5/7.
 */
public class BinarySortTree {


    class TreeNode{

        public int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value){
            this.value = value;
        }
    }

    public TreeNode root = null;

    public void insert(int data){
        TreeNode node = new TreeNode(data);
        if (root == null) {
            root = node;
        }else {
            TreeNode p = root;
            TreeNode parent = null;
            while (true){
                parent = p;
                if (node.value > p.value){
                    p = p.right;
                    if (p == null){
                        parent.right = node;
                        return;
                    }
                }else {
                    p = p.left;
                    if (p == null){
                        parent.left = node;
                        return;
                    }
                }
            }
        }
    }



}
