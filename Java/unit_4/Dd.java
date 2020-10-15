package Java.unit_4;

import java.util.Scanner;

public class Dd {
    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st side of the Traingle : \n");
        x = sc.nextInt();
        System.out.println("Enter the 2nd side of the Traingle : \n");
        y = sc.nextInt();
        System.out.println("Enter the 3rd side of the Traingle : \n");
        z = sc.nextInt();
        if (x == y && y == z && z == x)
            System.out.println("Traingle is Equilateral !!!");
        if (x == y || y == z || z == x)
            System.out.println("Traingle is Isoceles !!!");
        if (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2) || Math.pow(x, 2) + Math.pow(z, 2) == Math.pow(y, 2)
                || Math.pow(y, 2) + Math.pow(z, 2) == Math.pow(x, 2))
            System.out.println("Traingle is Right Angled !!!");
        sc.close();
    }
}
