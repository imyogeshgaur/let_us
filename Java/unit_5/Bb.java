package Java.unit_5;

import java.util.Scanner;

public class Bb {
    public static void main(String[] args) {
        int num, fact = 1, i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : \n");
        num = sc.nextInt();
        do {
            fact *= i;
            i++;
        } while (i <= num);
        System.out.println("The Factorial of " + num + " is : " + fact);
        sc.close();
    }
}
