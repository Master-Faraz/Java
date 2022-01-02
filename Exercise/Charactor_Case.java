import java.util.*;

public class Charactor_Case {
    public static void main(String[] args) // .Main
    {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        if ((c >= 'A') && (c <= 'Z'))
            System.out.println("Upper case letter ");
        else if ((c >= 'a') && (c <= 'z'))
            System.out.println("Lower case letter ");
        else
            System.out.println("Not english alphabet ");

    }

}
