package Java.unit_2;

import java.util.Scanner;

public class Fe {
    public static void main(String[] args) {
        double l1, l2, g1, g2, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Logintudnal Coordinates(in degrees) :");
        l1 = sc.nextDouble();
        l2 = sc.nextDouble();
        System.out.println("Enter the Latitudanal Coordinates (in degrees) : ");
        g1 = sc.nextDouble();
        g2 = sc.nextDouble();
        d = (Math.acos(Math.sin(l1) * Math.sin(l2) + Math.cos(l1) * Math.cos(l2) * Math.cos(g2 - g1)))
                * (180 / Math.PI);
        System.out.println("The Distance of the Coordinates from origin is : " + d * 3963);
        sc.close();
    }
}
