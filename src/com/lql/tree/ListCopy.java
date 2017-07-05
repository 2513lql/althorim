package com.lql.tree;

import java.util.List;

/**
 * Created by LQL on 2017/5/16.
 *
 * 复杂链表复制
 */
public class ListCopy {

    class Node{
        public int val;
        public Node next;
        public Node sibling;
        public Node(int val){
            this.val = val;
        }
    }

    public static Node copy(Node head){
        ListCopy copy = new ListCopy();
        Node p = head;
        while (p != null){
            Node n = copy.new Node(head.val);
            Node next = p.next;
            p.next = n;
            n.next = next;
        }

        if (p == null){
            return null;
        }
        p = head;
        while (p != null){
            p.next.sibling = p.sibling.next;
            p = p.next.next;
        }

        if (head == null) return null;
        p = head;
        Node head2 = p.next;
        p = head2;
        while (p.next != null){
            Node q = p.next.next;
            p.next = q;
            p = q;
        }
        return head2;
    }

}
