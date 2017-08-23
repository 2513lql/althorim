package com.lql.data.struct;

import java.util.TreeSet;
import java.util.function.IntUnaryOperator;

/**
 * Created by zyczyc on 2017/7/17.
 */
public class BSTree<T extends Comparable<T>> {



    static class BNode<T extends Comparable<T>>{

        public T value;
        public BNode<T> left;
        public BNode<T> right;
        public BNode<T> parent;
        public BNode(T value){

        }
    }

    private BNode<Integer> root;

    public BSTree(){
        this.root = null;
    }


    /**
     * 查找最小节点
     * @param node
     * @return
     */
    public BNode<T> minBNode(BNode<T> node){

        if (node == null)return null;

        while (node.left != null){
            node = node.left;
        }
        return node;
    }

    public BNode<T> maxBNode(BNode<T> node){
        if (node == null) return null;
        while (node.right != null){
            node = node.right;
        }
        return node;
    }


    public BNode<T> precestor(BNode<T> cur){
        if (cur == null) throw new NullPointerException("节点空指针");
        if (cur.left != null){
            return minBNode(cur);
        }
        return null;
    }

    public static void main(String[] args) {
    }

}
