package com.lql.offer;

import com.lql.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by LQL on 2017/5/22.
 *
 * 最低公共祖先
 */
public class LowestAncestor {


    /**
     * 递归求最近祖先
     * @param root
     * @param A
     * @param B
     * @return
     */
    public static TreeNode getLowestAncestor(TreeNode root, int A,int B){

        if (root == null || root.val == A || root.val == B){
            return root;
        }

        TreeNode left = getLowestAncestor(root.left,A,B);
        TreeNode right = getLowestAncestor(root.right,A,B);
        if (left != null && right != null){
            return root;
        }

        if (root.left != null){
            return left;
        }else {
            return right;
        }
    }

    public static TreeNode getCommonAncestor(TreeNode root,int A,int B){

        if (root == null || root.val == A || root.val == B){
            return root;
        }
        Stack<TreeNode> stack = new Stack<>();
        List<List<TreeNode>> res = new ArrayList<>();
        path(root,res,stack,A,B);
        if (res.size() < 2){
            return null;
        }
        List<TreeNode> list_a = res.get(0);
        List<TreeNode> list_b = res.get(1);
        for (int i = 0 ; i < list_a.size() - 1 && i < list_b.size() - 1;i++){
            if (list_a.get(i + 1).val != list_b.get(i + 1).val && list_a.get(i) == list_b.get(i)){
                return list_a.get(i);
            }
        }
        return null;
     }

    public static void path(TreeNode root,List<List<TreeNode>> res,Stack<TreeNode> stack,int A,int B){
        if (root == null){
            return;
        }
        if (root.val != A && root.val != B){
            stack.push(root);
        }else if (root.val == A){
            stack.push(root);
            res.add(stack);
        }else if (root.val == B){
            stack.push(root);
            res.add(stack);
        }
        if (root.left != null){
            path(root.left,res,stack,A,B);
        }
        if (root.right != null){
            path(root.right,res,stack,A,B);
        }
        stack.pop();
    }




}
