package com.lql.data.struct;

/**
 * Created by zyczyc on 2017/7/16.
 */
public class List<T> {


    static class Node<T>{
        public T value;
        Node next;
        public Node(T value){
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;
    public List(){
       head = tail = null;
    }

    public void add(T value){
        Node node = new Node(value);
        size++;
        if (tail == null){
            head = tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public T get(int index){
        if (index < - 1 || index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        if (tail == null) return null;
        Node p = head;
        int count = 0;
        while (count < size){
            if (p != null && count == index){
                return (T) p.value;
            }else {
                count++;
                p = p.next;
            }
        }
        return null;
    }


}
