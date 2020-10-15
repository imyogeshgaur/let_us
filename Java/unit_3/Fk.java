package Java.unit_3;

import java.util.Scanner;

public class Fk {
    public static void main(String[] args) {
        int x, y, x1, y1, r;
        double d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Horizontal Coordinates of Center : \n");
        x = sc.nextInt();
        System.out.println("Enter the Vertical Coordinates of the Center : \n");
        y = sc.nextInt();
        System.out.println("Enter the Radius of the Circle : \n");
        r = sc.nextInt();
        System.out.println("Enter the Horizontal Coordinates of the Circle : \n");
        x1 = sc.nextInt();
        System.out.println("Enter the Vertical Coordinates of the Circle : \n");
        y1 = sc.nextInt();
        d = (Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2)));
        if (d > r)
            System.out.println("The Point lies Outside the Circle !!!");
        else if (d == r)
            System.out.println("The Point lies On the Circle !!!");
        else
            System.out.println("The Point Lies Inside the Circle !!!!");
        sc.close();
    }
}
