import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {

        // . Key + Value pairs --> UNIQUE key --> O(1)

        HashMap<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        numbers.put("One", 100); // . It UPDATES the one key

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
