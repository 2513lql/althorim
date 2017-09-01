package com.lql.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by LQL on 2017/3/3.
 *
 * 输出二叉树中和为某个数的全部路径
 *
 */
public class PathOfSum {

    private static List<List<Integer>> res = new ArrayList<>();

    public static List<List<Integer>> pathOfSum(TreeNode root,int sum){

        if (root == null) return null;
        Stack<Integer> cur = new Stack<>();
        path(root,cur,sum);
        return res;
    }

    public static void path(TreeNode root, Stack<Integer> cur, int sum){
        cur.add(root.val);
        if (root.left == null && root.right == null && sum == root.val){
            res.add(new ArrayList<>(cur));
        }
        if (root.left != null) path(root.left,cur,sum - root.val);
        if (root.right != null) path(root.right,cur,sum - root.val);
        cur.pop();
    }


    public static void main(String[] args) {
        ConcurrentHashMap<String,String> hashMap = new ConcurrentHashMap<>();
    }



}
