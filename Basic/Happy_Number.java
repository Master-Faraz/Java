import java.util.Scanner;

public class Happy_Number {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    System.out.println(is_happy(num));

  }

  public static int SqSum(int n) {
    int sum = 0;
    while (n != 0) {
      sum += (n % 10);
      n = n / 10;
    }
    return sum;
  }

  public static boolean is_happy(int num) {

    if (num >= 0) {
      int res = num;
      while (res > 9) {
        res = SqSum(res);
      }

      if (res == 1)
        return true;

    }
    return false;
  }
}