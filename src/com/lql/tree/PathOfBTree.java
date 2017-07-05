package com.lql.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by LQL on 2017/5/16.
 */
public class PathOfBTree {

    public static void path(TreeNode root,Stack<Integer> stack,int sum,List<List<Integer>> res){

        if (root.left == null && root.right == null && sum == root.val){
            res.add(stack);
        }
        stack.push(root.val);
        if (root.left != null){
            path(root.left,stack,sum - root.val,res);
        }
        if (root.right != null){
            path(root.right,stack,sum - root.val,res);
        }
        stack.pop();
    }

    public static List<List<Integer>> sumOfPath(TreeNode root,int sum){
        List<List<Integer>>  res = new LinkedList<>();
        if (root == null){
            return res;
        }
        Stack<Integer> stack = new Stack<>();
        path(root,stack,sum,res);
        return res;
    }

}
