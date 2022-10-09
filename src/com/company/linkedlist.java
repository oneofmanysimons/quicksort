package com.company;

import java.util.Random;

public class linkedlist {
    Node head;
    Node tail;

    // Double Linked list Node
    public static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d, Node next) { data = d; this.next = next;}

        public void append(Node data)
        {
            next = data;
        }
    }
    public void addlength(int size){
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            add(rnd.nextInt(size*10));
        }
    }
    public void add(int data){
        if (head == null && tail == null){
            Node add = new Node(data, null);
            head = add;
            tail = add;
        }else {
            head = new Node(data, head);
        }
    }
    public void append(Node data)
    {
        //for empty linked list
        if (head == null && tail == null){
            head = data;
            tail = data;
            return;
        }
        //for not empty linked list
        if (data == null){
            return;
        }else {
            tail.next = data;
            tail = data;
        }
    }

    void printList(Node n)
    {
        while (n != null) {
            System.out.print(n.data);
            System.out.print(" ");
            n = n.next;
        }
    }
    public Node getHead(){return head;}
    public Node getTail(){return tail;}
}
