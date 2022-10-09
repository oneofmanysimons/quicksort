package com.company;

public class quicksortlinkedlist {
    public static void sort(linkedlist a){
        sort(a, a.getHead(), a.getTail());
    }
    private static void sort(linkedlist a,linkedlist.Node head, linkedlist.Node tail){
        if (head == null || head == tail || head.next == tail)
            return;
        linkedlist.Node pivot = paritionLast(head, tail);
        sort(a,head, pivot);
        sort(a,pivot.next,tail);
    }
    private static linkedlist.Node paritionLast(linkedlist.Node first, linkedlist.Node last){
        linkedlist.Node pivotNode = first;
        linkedlist greater = new linkedlist();
        linkedlist lesser = new linkedlist();
        while (first != last) {
            if (first.data <= pivotNode.data) {
                lesser.append(first);
            } else {
                greater.append(first);
            }
            first = first.next;
        }
        if (last != null){
            if (last.data <= pivotNode.data) {
                lesser.append(last);
            } else {
                greater.append(last);
            }
        }
        lesser.append(pivotNode);
        lesser.append(greater.head);
        return pivotNode;
    }
}
