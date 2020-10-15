package Java.unit_2;

import java.util.Scanner;

public class Fa {
    public static void main(String[] args) {
        int sum = 0, m, n;
        System.out.println("Enter the Number : \n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n > 0) {
            m = n % 10;
            sum += m;
            n /= 10;
        }
        System.out.println("The Sum of digits of the number : " + sum);
        sc.close();
    }

}
