import java.util.*;

public class Sum_Of_Even_Odd_Numbers_STRING {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int even = 0, odd = 0;

        // A temporary string
        String temp = "0";

        for (int i = 0; i < s.length(); i++)// .
        {
            char ch = s.charAt(i);

            // if current character is a digit
            if (Character.isDigit(ch))
                temp += ch;
            // if current character is an alphabet
            else {
                // increment sum by number found earlier
                // (if any)
                sum += Integer.parseInt(temp);

                // reset temporary string to empty
                temp = "0";
            }

        }
    }
}
