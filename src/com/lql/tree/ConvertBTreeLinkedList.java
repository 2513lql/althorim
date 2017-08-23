package com.lql.tree;

/**
 * Created by LQL on 2017/5/10.
 */
public class ConvertBTreeLinkedList {





    public static void convertLinkedList(TreeNode root,TreeNode firstNode,TreeNode lastNode){

        TreeNode leftFirstNode = null,leftLastNode=null,rightFirstNode=null,rightLastNode=null;
        if (root == null){
            firstNode = null;
            lastNode = null;
            return;
        }
        if (root.left == null){
            firstNode = root;
        }else {
            convertLinkedList(root.left,leftFirstNode,leftLastNode);
            firstNode = leftFirstNode;
            root.left = leftLastNode;
            leftLastNode.right = root;
        }
        if (root.right == null){
            lastNode = root;
        }else {
            convertLinkedList(root.right,rightFirstNode,rightLastNode);
            lastNode = rightLastNode;
            root.right = rightFirstNode;
            rightFirstNode.left = root;
        }
        return;
    }


    public static void main(String[] args) {

        TreeNode firstNode = null,lastNode = null;
        convertLinkedList(BinaryTreeUtil.generateBinaryTree(),firstNode,lastNode);
        if (firstNode != null){
            System.out.println(firstNode.val);
        }
        if (lastNode != null){
            System.out.println(lastNode.val);
        }

    }


}
