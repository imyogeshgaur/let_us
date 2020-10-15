package Java.unit_2;

import java.util.Scanner;

public class Fc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, s, ar;
        System.out.println("Enter the 1st Side of the Traingle : ");
        a = sc.nextDouble();
        System.out.println("Enter the 2nd Side of the Traingle : ");
        b = sc.nextDouble();
        System.out.println("Enter the 3rd Side of the Traingle : ");
        c = sc.nextDouble();
        s = (a + b + c) / 2;
        ar = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The Area of the Traingle is : " + ar);
        sc.close();
    }
}
