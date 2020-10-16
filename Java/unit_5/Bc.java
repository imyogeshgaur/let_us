package Java.unit_5;

import java.util.Scanner;

public class Bc {
  static int CalcPow(int x, int y) {
    int i;
    int n = 1;
    ;
    for (i = 0; i < y; ++i)
      n *= x;
    return (n);
  }

  public static void main(String[] args) {
    int n, e, a;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number : \n");
    n = sc.nextInt();
    System.out.println("Enter the Exponent : \n");
    e = sc.nextInt();
    a = CalcPow(n, e);
    System.out.println("The final Answer is : \n" + a);
    sc.close();
  }
}
