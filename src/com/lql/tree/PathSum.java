package com.lql.tree;

/**
 * Created by LQL on 2017/1/16.
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {

        if (root == null) return false;
        else {
            if (root.left == null && root.right == null && sum == root.val){
                return true;
            }else {
                return hasPathSum(root.left,sum - root.val) || hasPathSum(root.right,sum - root.val);
            }
        }
    }





}
