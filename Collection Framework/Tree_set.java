import java.util.TreeSet;

public class Tree_set {
    public static void main(String[] args) {

        // . In UNIQUE + SORTED form --> BST implementation   --> O(log n )

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(32);
        ts.add(2);
        ts.add(125);
        ts.add(35);
        ts.add(29);
        ts.add(9);

        System.out.println(ts); // . Sorted form

        ts.remove(9);
        System.out.println(ts);

        System.out.println(ts.contains(94));

        ts.clear();
        System.out.println(ts.size());
        System.out.println(ts.isEmpty());

    }

}
