import java.util.*;

public class Prime {
    public static void main(String[] args) {

        int n;

        System.out.println("Enter a number to check prime or not");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        prime_sqrt(n);

    }

    static void prime_Neive(int n) {
        int f = 2;
        while (f <= n - 1) {

            if ((n % f) == 0) {
                System.out.println("Not prime");
                return;
            }

            f++;
        }
        System.out.println("Prime");

    }

    static void prime_sqrt(int n) {
        // Check if number is less than
        // equal to 1
        if (n <= 1) {
            System.out.println("Not prime");
            return;
        }
        // Check if number is 2
        else if (n == 2)
            System.out.println("Prime");

        // Check if n is a multiple of 2
        else if (n % 2 == 0) {
            System.out.println("Not prime");
            return;
        } else {
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    System.out.println("Not prime");
                    return;
                }
            }
            System.out.println("prime");
        }

    }
}