package Java.unit_2;

import java.util.Scanner;

public class Fd {
    public static void main(String[] args) {
        double x, y, r, th;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Horizontal Catresian Coordinates : \n");
        x = sc.nextDouble();
        System.out.println("Enter the Vertical Cartesian Coordinates :\n");
        y = sc.nextDouble();
        r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        th = Math.atan(y / x);
        System.out.println("The Polar Coordinates Are Given by: \n r = " + r + " \n Angle = " + th * 180 / Math.PI);
        sc.close();
    }
}
