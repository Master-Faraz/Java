import java.util.*;

public class List {
    public static void main(String[] args) {

        // . creating array list
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1, 100);

        // for (int i = 0; i < arr.size(); i++) {
        // System.out.println(arr.get(i));
        // }

        // . Merging two arraylist

        ArrayList<Integer> arr_new = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr_new.add((i + 1) * 100);
        }

        // System.out.println("Before merging size : "+arr.size() + "\nAfter merging
        // size : ");
        arr.addAll(arr_new);
        // System.out.println(arr.size());

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        

    }
}