package com.lql.tree;

import java.util.*;

/**
 * Created by LQL on 2017/5/10.
 */
public class IsSameStruct {


    public static boolean isSameBtree(TreeNode root1,TreeNode root2){
        if (root1 == null && root2 == null){
            return true;
        }
        if (root1 == null || root2 == null){
            return false;
        }
        return isSameBtree(root1.left,root2.left) && isSameBtree(root1.left,root2.left);
    }

    public static void main(String[] args) {
        System.out.println(isSameBtree(BinaryTreeUtil.generateBinaryTree(),BinaryTreeUtil.generateBinaryTree()));
        List<String> strings = new LinkedList<>();
        Set<String> set = new HashSet<>();
        set.addAll(strings);
    }

}
