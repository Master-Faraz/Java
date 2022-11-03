import java.util.TreeMap;
import java.util.Map;

public class Tree_Map {
    public static void main(String[] args) {

        // . Key + Value pairs --> UNIQUE + Sorted key--> BST --> O(log n)
 
        TreeMap<String, Integer> numbers = new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        numbers.put("One", 100); // . It UPDATES the one key

        numbers.remove("One");

        System.out.println(numbers);

        numbers.putIfAbsent("Two", 200); // . Cannot Override key
        System.out.println(numbers);

        System.out.println(numbers.containsKey("Two"));
        System.out.println(numbers.containsValue(500));

        // .********************** Iterating ****************
        // . Using Entry Class

        for (Map.Entry<String, Integer> e : numbers.entrySet()) // . Entry
        {
            System.out.print(e + "\t");
        }
        System.out.println("\n");

        for (Map.Entry<String, Integer> e : numbers.entrySet()) // . For Keys
        {
            System.out.print(e.getKey() + "\t");
        }
        System.out.println("\n");

        for (Map.Entry<String, Integer> e : numbers.entrySet()) // . For Values
        {
            System.out.print(e.getValue() + "\t");
        }
        System.out.println("\n");

        for (String key : numbers.keySet())
            System.out.println(key);

        for (Integer value : numbers.values())
            System.out.println(value);

        numbers.clear();
        System.out.println(numbers.isEmpty());

    }
}
