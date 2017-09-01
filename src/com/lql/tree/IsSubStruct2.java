package com.lql.tree;

/**
 * Created by zyczyc on 2017/8/27.
 */
public class IsSubStruct2 {

    public static boolean isSub(TreeNode root,TreeNode subRoot){

        if (subRoot == null){
            return true;
        }
        if (root == null){
            return false;
        }

        return isSame(root,subRoot) || isSame(root.left,subRoot) || isSame(root.right,subRoot);
    }

    public static boolean isSame(TreeNode root,TreeNode root1){

        if (root1 == null){
            return true;
        }
        if (root == null){
            return false;
        }
        if (root.val == root1.val){
            return isSame(root.left,root1.left) && isSame(root.right,root1.right);
        }
        return false;
    }

}
