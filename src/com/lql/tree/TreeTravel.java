package com.lql.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by LQL on 2017/5/10.
 */
public class TreeTravel {


    public static void postTravel(TreeNode root){
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

        while (!output.isEmpty()){
            p = output.pop();
            System.out.println(p.val);
        }
    }

    public static void levelTravel(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode p = root;
        if (p != null){
            queue.add(p);
        }
        int count = 0;
        int flag = 1;
        while (!queue.isEmpty()){
            p = queue.poll();
            System.out.print(p.val);
            flag--;
            if (p.left != null){
                count++;
                queue.offer(p.left);
            }
            if (p.right != null){
                count++;
                queue.offer(p.right);
            }
            if (flag == 0){
                System.out.println();
                flag = count;
            }
        }

    }


    public static void main(String[] args) {
        levelTravel(BinaryTreeUtil.generateBinaryTree());
    }

}
