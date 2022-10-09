package com.company;

public class quicksortlink {
    public static void sort(linkedlist a){
        sort(a.getHead(), a.getTail());
    }
    //here we sort left of pivot and right of pivot or the pivot included.
    private static void sort(linkedlist.Node head, linkedlist.Node tail) {
        {
            if (head == null || head == tail || head == tail.next)
                return;

            // Split list and partition recurse
            linkedlist.Node pivot_prev = paritionLast(head, tail);
            sort(head, pivot_prev);

            // If pivot is picked and moved to the start,
            // that means start and pivot is same
            // so pick from next of pivot
            if (pivot_prev != null && pivot_prev == head)
                sort(pivot_prev.next, tail);

                // If pivot is in between of the list,
                // start from next of pivot,
                // since we have pivot_prev, so we move two nodes
            else if (pivot_prev != null
                    && pivot_prev.next != null)
                sort(pivot_prev.next.next, tail);
        }
    }
    //Here we partion the nodes, return the node before pivot.
    static linkedlist.Node paritionLast(linkedlist.Node start, linkedlist.Node end)
    {
        if (start == end || start == null || end == null)
            return start;

        linkedlist.Node pivot_prev = start;
        linkedlist.Node curr = start;
        int pivot = end.data;

        // iterate till one before the end,
        // no need to iterate till the end
        // because end is pivot
        while (start != end) {
            if (start.data < pivot) {
                // keep tracks of last modified item
                pivot_prev = curr;
                //swap
                int temp = curr.data;
                curr.data = start.data;
                start.data = temp;
                //swap end
                //increment
                curr = curr.next;
            }
            //increment start
            start = start.next;
        }

        // Swap the position of curr i.e.
        // next suitable index and pivot
        int temp = curr.data;
        curr.data = pivot;
        end.data = temp;

        // Return one previous to current
        // because current is now pointing to pivot
        return pivot_prev;
    }
}
