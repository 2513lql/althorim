package com.lql.offer;

import com.lql.leetcode.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by LQL on 2017/3/15.
 *
 * 由先序，中序序列构造二叉树
 *
 */
public class CreateBinaryTree {

    public static TreeNode reConstructBinaryTree(int [] pre, int [] in) {

        if (pre.length == 0 || in.length == 0) return null;

        TreeNode root = new TreeNode(pre[0]);

        int leftSize = 0;
        int rightSize = 0;
        int i = 0;
        for (i = 0; in[i] != pre[0];i++){
            leftSize++;
        }
        rightSize = in.length - leftSize - 1;

        int[] leftPre = new int[leftSize];
        int[] leftIn = new int[leftSize];
        int[] rightPre = new int[rightSize];
        int[] rightIn = new int[rightSize];

        for (i = 1; i <= leftSize;i++){
            leftPre[i - 1] = pre[i];
            leftIn[i - 1] = in[i - 1];
        }
        for (int j = 0; i < pre.length;i++,j++){
            rightPre[j] = pre[i];
            rightIn[j] = in[i];
        }

        TreeNode left = reConstructBinaryTree(leftPre,leftIn);
        TreeNode right = reConstructBinaryTree(rightPre,rightIn);

        root.left = left;
        root.right = right;
        return root;
    }



    public static TreeNode createLeftTree(int[] pre,int[] in){
        return null;
    }

    public static TreeNode createRightTree(int[] pre , int[] in){
        return null;
    }


    public static void levelTravel(TreeNode root){
        TreeNode p = root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            p = queue.poll();
            if (p != null){
                System.out.print(p.val + " ");
            }
            if (p.left != null){
                queue.add(p.left);
            }
            if (p.right != null){
                queue.add(p.right);
            }
        }
    }


    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode root = reConstructBinaryTree(pre,in);
        levelTravel(root);

    }

}
