package com.lql.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by LQL on 2017/1/16.
 */
public class SumOfPath {

    public static void pathOfSum(TreeNode root, int curSum, int sum, List<List<TreeNode>> result,List<TreeNode> curPath){

        if (root != null){
            if (curSum == sum){
                result.add(curPath);
            }
            curPath.add(root);
            pathOfSum(root.left,curSum+root.val,sum,result,curPath);
            pathOfSum(root.right,curSum+root.val,sum,result,curPath);
        }
    }


    public static void main(String[] args) {
        TreeNode root = BinaryTreeUtil.generateBinaryTree();
    }


}
