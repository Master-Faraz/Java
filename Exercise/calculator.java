import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        System.out.println("Enter two numbers");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt(), b = num.nextInt();

        System.out.println("Enter the operator");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        switch (c) {
            case '+':
                System.out.println("Result is " + (a + b));
                break;
            case '-':
                System.out.println("Result is " + (a - b));
                break;
            case '*':
                System.out.println("Result is " + (a * b));
                break;
            case '/':
                System.out.println("Result is " + ((float) a / b));
                break;

            default:
                System.out.println("Please enter valid operator -_-");
                break;
        }

    }
}
