package Java.unit_3;

import java.util.Scanner;

public class Fc {
    public static void main(String[] args) {
        int yr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : \n");
        yr = sc.nextInt();
        if (yr % 4 == 0)
            System.out.println("Year is a leap Year !!!");
        else
            System.out.println("Year is  not a leap Year !!!");
        sc.close();
    }
}
