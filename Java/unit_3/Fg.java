package Java.unit_3;

import java.util.Scanner;

public class Fg {
    public static void main(String[] args) {
        double a1, a2, a3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st angle of the Traingle : \n");
        a1 = sc.nextDouble();
        System.out.println("Enter the 2nd angle of the Traingle : \n");
        a2 = sc.nextDouble();
        System.out.println("Enter the 3rd angle of the Traingle : \n");
        a3 = sc.nextDouble();
        if (a1 + a2 + a3 == 180)
            System.out.println("It is a Valid Traingle !!! ");
        else
            System.out.println("It is an Invalid Traingle !!! ");
        sc.close();
    }
}
