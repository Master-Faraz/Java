import java.util.HashMap;
import java.util.Scanner;

public class Max_Occuring_char {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        System.out.println(count_max_char(word));
    }

    public static char count_max_char(String s) {
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        int count = -1, max_count = -1;
        char ch, res = ' ';

        for (int i = 0; i < s.length(); i++) // If hashmap already contains
        {
            ch = s.charAt(i); // . Character

            if (hash.containsKey(ch)) {
                count = hash.get(ch); // . Character count
                count++;
                hash.replace(ch, count);

                if (max_count < count)
                    res = ch;
            } else // . Character occured first time
            {
                hash.put(ch, 1);
            }
        }

        return res;

    }
}
