import java.util.LinkedHashSet;
import java.util.Iterator;

public class Linked_Hash_set {
    public static void main(String[] args) {
        // . Same as Hash Set but order follows Linked List

        // Creating an empty LinkedHashSet of string type

        LinkedHashSet<String> linkedset = new LinkedHashSet<String>();

        // Adding element to LinkedHashSet
        // using add() method --> Insertion order is maintained
        linkedset.add("A");
        linkedset.add("B");
        linkedset.add("C");
        linkedset.add("D");

        // Note: This will not add new element
        // as A already exists
        linkedset.add("A");
        linkedset.add("E");

        // ************************ size of LinkedHashSet ***********
        System.out.println("Size of LinkedHashSet = " + linkedset.size());

        System.out.println("Original LinkedHashSet:" + linkedset);

        // ******************* Removing existing entry from above Set **********
        // using remove() method
        System.out.println("Removing D from LinkedHashSet: " + linkedset.remove("D"));

        // Removing existing entry from above Set
        // that does not exist in Set
        System.out.println("Trying to Remove Z which is not " + "present: " + linkedset.remove("Z"));

        // *********** Checking for element whether it is present inside *********
        // Set or not using contains() method
        System.out.println("Checking if A is present=" + linkedset.contains("A"));

        // Creating an empty LinkedHashSet
        LinkedHashSet<String> hs = new LinkedHashSet<String>();

        // Adding elements to above Set
        // using add() method

        // Note: Insertion order is maintained
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");

        // Printing elements of Set
        System.out.println("\n\nLinkedHashSet : " + hs);

        // Iterating though the LinkedHashSet
        // using iterators
        Iterator itr = hs.iterator();

        while (itr.hasNext())
            System.out.print(itr.next() + ", ");

        // New line
        System.out.println();

        // Using enhanced for loop for iteration
        for (String s : hs)
            System.out.print(s + ", ");
        System.out.println();

    }

}
