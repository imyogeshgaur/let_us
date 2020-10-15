package Java.unit_2;

import java.util.Scanner;

public class Fh {
    public static void main(String[] args) {
        int c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of C : \n");
        c = sc.nextInt();
        System.out.println("Enter the value of D : \n");
        d = sc.nextInt();
        System.out.println("Entered values of C and D are " + c + " and " + d + " repectively \n");
        c += d;
        d = c - d;
        c -= d;
        System.out.println("Final Value of C and d are " + c + " and " + d + " respectively ");
        sc.close();
    }
}
