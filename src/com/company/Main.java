package com.company;

import java.util.Random;

public class Main {
    public static void fun(int j){
        j = 7 + 2;
    }

    public static int kul(int j){
        return j = j + 3;
    }

    public static void main(String[] args)
    {
        int j = 10;
        System.out.println(j);
        fun(j);
        System.out.println(j);

        /*
        linkedlist a = new linkedlist();
        Random rnd = new Random();
        int size = 50;
        for (int i = 0; i < size; i++) {
            a.addNode(rnd.nextInt(size*size));
        }

        System.out.println("Linked List before sorting");
        a.printList(a.head);

        // Function call
        quicksortlink.sort(a);

        System.out.println("\nLinked List after sorting");
        a.printList(a.head);
        */
        /*
        linkedlist a = new linkedlist();
        int size = 5;
        a.addlength(size);
        a.printList(a.getHead());
        System.out.println();
        quicksortlinkedlist.sort(a);
        a.printList(a.getHead());
        int limit = (int) Math.pow(size,5);
        while (size <= limit) {
            //benchmarks.quicksortarray(size);
            //benchmarks.quicksortlink(size);
            size += size;
        }
        size = 10;
        while (size <= limit) {
            //benchmarks.quicksortlink(size);
            size += size;
        }
        */
    }
}

