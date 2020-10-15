package Java.unit_3;

import java.util.Scanner;

public class Fb {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : \n");
        num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("The Number is an Even Number !!!");
        else
            System.out.println("The Number is an odd Number !!!");
        sc.close();
    }
}
