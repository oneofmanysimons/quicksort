package com.company;

public class linkedListGenerics<T>{
    private Node head;
    public class Node{
        T data;
        Node next;
        public Node(T data){
            this.data = data;
            next = null;
        }
    }
    public Node getHead(){return this.head;}

    public void add(T item){
        Node new_node = new Node(item);
        new_node.next = this.head;
    }
    public void remove(){
        if (head != null && head.next != null){
            head = head.next;
        }
    }
}
