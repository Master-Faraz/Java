import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;

public class COLLECTION_CLASS {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(122);
        arr.add(12);
        arr.add(30);
        arr.add(30);
        arr.add(30);
        arr.add(1, 100);

        // System.out.println("MIN element : " + Collections.min(arr));
        // System.out.println("MAX element : " + Collections.max(arr));

        // System.out.println("Frequency of 30 : " + Collections.frequency(arr, 30));

        // Collections.sort(arr); // . Sorting Collections
        // System.out.println(arr);

        // Collections.sort(arr, Comparator.reverseOrder()); // . Sorting in reverse
        // order
        // System.out.println(arr);

        // .*********************** Sorting Custom Class *************

        ArrayList<Student> st = new ArrayList<>();

        st.add(new Student("Faraz", 191044));
        st.add(new Student("Adam", 191045));
        st.add(new Student("Arshad", 191046));
        st.add(new Student("Hasrat", 191054));

        Student s1 = new Student("Faraz", 191044);
        Student s2 = new Student("Adam", 191055);

        // System.out.println(s1.compareTo(s2));

        // System.out.println(st);

        // Collections.sort(arr, new Comparator<Student>() {
        //     @Override
        //     public int compare(Student s1, Student s2) {
        //         return s1.name.compareTo(s2.name);
        //     }

        // });

        // Arrays.sort(st);


    }

}
