import java.util.HashSet;
import java.util.Set;

import java.util.*;

public class Hash_Set {
    public static void main(String[] args) {
        // . NO Duplicates Allowed --> Unordered --> O(1)

        HashSet<Integer> hs = new HashSet<>();
        Set<Integer> Hash_set = new HashSet<>();

        hs.add(320);
        hs.add(40);
        hs.add(20);
        hs.add(54);
        hs.add(94);

        hs.add(94);

        System.out.println(hs);

        hs.remove(94);
        System.out.println(hs);

        System.out.println(hs.contains(94));

        hs.clear();
        System.out.println(hs.size());

        // .*************************Custom Datatype Hashset ********************

        Set<Student> st = new HashSet<>();
        st.add(new Student("Faraz", 191044));
        st.add(new Student("Adam", 191045));

        // . Same roll as Faraz
        st.add(new Student("Faraz", 191044)); 
        st.add(new Student("A", 191044));

        Student s1 = new Student("Faraz", 191044);
        Student s2 = new Student("Adam", 191044);

        System.out.println(st);
        System.out.println(s1.equals(s2));

    }

}
