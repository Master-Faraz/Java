import java.util.*;

public class Array_List {
    public static void main(String[] args) {

        // ********** Creating array list ***************************************
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);

        arr.add(1, 100);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        // ************** Merging two arraylist ***********************************

        ArrayList<Integer> arr_new = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr_new.add((i + 1) * 100);
        }

        System.out.println("Before merging size : " + arr.size() + "\nAfter merging size : ");
        arr.addAll(arr_new);
        System.out.println(arr.size());

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        // ********************** Removing elements *********************************

        arr.remove(1); // . Remove index 1
        arr.remove(Integer.valueOf(200)); // . Remove element 200

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "\t");
        }

        // ********** Updating element And CHECKING If element is present in arraylist

        arr.set(2, 1000);

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "\t");
        }

        // ********** Iterating in list ******************************************

        System.out.println(arr); // . Returns arraylist

        for (int i = 0; i < arr.size(); i++) // . For loop
        {
            System.out.print(arr.get(i) + "\t");
        }

        for (Integer i : arr) // . For each Loop
        {
            System.out.println(i);
        }

        Iterator it = arr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}