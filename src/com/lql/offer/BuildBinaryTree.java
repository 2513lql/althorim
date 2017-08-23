package com.lql.offer;

import com.lql.leetcode.tree.TreeUtil;
import com.lql.tree.TreeNode;
import com.lql.tree.TreeTravel;

/**
 * Created by zyczyc on 2017/8/12.
 *
 * 根据前序遍历和中序遍历构建二叉排序树
 * 构建二叉树
 */
public class BuildBinaryTree {


    public static TreeNode buildTree(int[] preOrders,int preLeft,int preRight,int[] inOrders,int inLeft,int inRight){
        if (preLeft > preRight || inLeft > inRight){
            return null;
        }
        if (preOrders == null || inOrders == null || preOrders.length == 0 || inOrders.length == 0){
            return null;
        }
        int val = preOrders[preLeft];
        TreeNode root = new TreeNode(val);
        int k = 0;
        for (int i = inLeft;i <= inRight; i++){
            if (inOrders[i] == val){
                break;
            }
            k++;
        }
        root.left = buildTree(preOrders,preLeft + 1,preLeft + k,inOrders , inLeft,inLeft + k - 1);
        root.right = buildTree(preOrders,preLeft + k + 1,preRight,inOrders,inLeft + k + 1,inRight);
        return root;
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode root = buildTree(pre,0,7,in,0,7);
        TreeTravel.levelTravel(root);

    }

}



