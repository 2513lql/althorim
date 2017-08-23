package com.lql.offer;

import com.lql.tree.TreeNode;

/**
 * Created by zyczyc on 2017/8/12.
 *
 * 树的子结构
 */
public class BinaryTreeChildStruct {


    public static boolean isSubStruct(TreeNode rootNode,TreeNode subNode){


        if (subNode == null){
            return true;
        }
        if (rootNode == null){
            return false;
        }
        if (rootNode.val != subNode.val){
            return false;
        }
        return isSubStruct(rootNode.left,subNode.left) && isSubStruct(rootNode.right,subNode.right);
    }

    public static boolean subChild(TreeNode root,TreeNode sub){

        if (root == null){
            return false;
        }
        boolean flag = isSubStruct(root,sub);
        if (flag != true){
            return subChild(root.left , sub) || subChild(root.right ,sub);
        }else {
            return flag;
        }
    }

}
