package Java.unit_3;

import java.util.Scanner;

public class Fj {
    public static void main(String[] args) {
        int x1, x2, x3, y1, y2, y3;
        float a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Horizontal coordinate of 1st point : \n");
        x1 = sc.nextInt();
        System.out.println("Enter the Horizontal coordinate of 2nd point : \n");
        x2 = sc.nextInt();
        System.out.println("Enter the Horizontal coordinate of 3rd point : \n");
        x3 = sc.nextInt();
        System.out.println("Enter the Vertical coordinate of 1st point : \n");
        y1 = sc.nextInt();
        System.out.println("Enter the Vertical coordinate of 2nd point : \n");
        y2 = sc.nextInt();
        System.out.println("Enter the Vertical coordinate of 3rd point : \n");
        y3 = sc.nextInt();
        a = 1 / 2 * (x1 * (y2 - y3) + x2 * (y2 - y1) + x3 * (y1 - y2));
        if (a == 0.0)
            System.out.println("Points lie in a Line !!!");
        else
            System.out.println("Points not lie in a Line !!!");
        sc.close();
    }
}
