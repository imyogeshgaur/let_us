package Java.unit_4;

import java.util.Scanner;

public class Da {
    public static void main(String[] args) {
        int yr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year : \n");
        yr = sc.nextInt();
        if (yr % 4 == 0)
            System.out.println("Year is a Leap Year !!!");
        else
            System.out.println("Year is a not a  Leap Year !!!");
        sc.close();
    }
}
