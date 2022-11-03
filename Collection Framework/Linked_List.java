import java.util.LinkedList;
import java.util.Queue;

public class Linked_List {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // . ****************** Pushing and popping element in queue **********

        q.offer(10);
        q.offer(20);
        q.offer(30);

        q.add(40);
        q.add(50);

        // . Better use q.add for no exceptions as q.add throws the exception and crash
        // the program

        System.out.println(q);

        int x = q.poll(); // . It returns the element

        System.out.println(q);
        System.out.println("Popped element is " + x);

        // . ******************* Top pointer **********

        System.out.println(q.peek()); // . best use no exception
        System.out.println(q.element());

        // .***************** Implementation using Linked List *******************
        // ********************************************************************

        // . Same functions as arraylist

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);

        ll.add(1, 100);

        System.out.println(ll);

        // ************** Merging two Linked list ***********************************

        ll.addAll(q);
        System.out.println(ll);

        System.out.println(ll.size());

        // ********************** Removing elements *********************************

        ll.remove(1);
        ll.remove(Integer.valueOf(3));

        System.out.println(ll);

        // ********** Updating element And CHECKING If element is present in linked list

        ll.set(2, 1000);

        System.out.println(ll);

        // ********** Iterating in list ******************************************

        System.out.println(ll); // . Returns arraylist

        for (int i = 0; i < ll.size(); i++) // . For loop
        {
            System.out.print(ll.get(i) + "\t");
        }

        for (Integer i : ll) // . For each Loop
        {
            System.out.println(i);
        }

    }

}
