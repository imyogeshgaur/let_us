package Java.unit_2;

import java.util.Scanner;

public class Fb {
    public static void main(String[] args) {
        long n, r = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        n = sc.nextInt();
        while (n != 0) {
            r *= 10;
            r += n % 10;
            n /= 10;
        }
        System.out.println("The Reverse of the Number is : " + r);
        sc.close();
    }
}
