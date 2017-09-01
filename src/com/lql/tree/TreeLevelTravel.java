package com.lql.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by LQL on 2017/3/3.
 *
 * 二叉树层次打印
 */
public class TreeLevelTravel {

    public static void levelsTravel(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode p = root;
        queue.add(p);
        while (!queue.isEmpty()){
            p = queue.poll();
            if (p != null){
                System.out.print(p.val + " ");
                if (p.left != null)
                    queue.add(p.left);
                if (p.right != null)
                    queue.add(p.right);
            }
        }
    }


    public static void inOrder(TreeNode root){

        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()){

            if (p != null){
                stack.push(p);
                p = p.left;
            }else{
                p = stack.pop();
                System.out.print(p.val + " ");
                p = p.right;
            }
        }
    }

    public static void preOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;

        while (p != null || !stack.isEmpty()){
            if (p != null){
                System.out.print(p.val + " ");
                stack.push(p);
                p = p.left;
            }else{
                p = stack.pop();
                p = p.right;
            }

        }
    }

    public static void postOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> output = new Stack<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()){
            if (p != null){
                stack.push(p);
                output.push(p);
                p = p.right;
            }else {
                p = stack.pop();
                p = p.left;
            }
        }
    }



    public static void main(String[] args) {
//        levelsTravel(BinaryTreeUtil.generateBinaryTree());
        inOrder(BinaryTreeUtil.generateBinaryTree());
        System.out.println();
        preOrder(BinaryTreeUtil.generateBinaryTree());
    }

}
