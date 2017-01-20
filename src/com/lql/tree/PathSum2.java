package com.lql.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by LQL on 2017/1/16.
 */
public class PathSum2 {

    public static List<List<Integer>> result = new ArrayList<>();

    public static void path(TreeNode root,int sum,Stack<Integer> path){
        path.push(root.val);
        if (root.left == null && root.right == null && sum == root.val){
            result.add(new ArrayList<>(path));
        }
        if (root.left != null) path(root.left, sum - root.val, path);
        if (root.right != null) path(root.right,sum - root.val,path);
        path.pop();
    }

    public static List<List<Integer>> pathSum(TreeNode root, int sum){

        if (root == null) return result;
        Stack<Integer> path = new Stack<>();
        path(root,sum,path);
        return result;
    }



}
