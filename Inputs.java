import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        int a;

        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in); // SC is a non-preemptive data-type --> size is not fixed
        a = sc.nextInt(); // for int input

        System.out.println(a);

        System.out.println("Enter a float number");
        float age = sc.nextFloat();
        System.out.println(age);

        System.out.println("Enter a string ");
        Scanner st = new Scanner(System.in);
        String s = st.nextLine();
        System.out.println(s);

    }

}