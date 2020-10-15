package Java.unit_4;

import java.util.Scanner;

public class Dc {
    static int great(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else if (b > c) {
            if (b > a) {
                return b;
            } else {
                return a;
            }
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int p, q, r, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st side of the Trainge : \n");
        p = sc.nextInt();
        System.out.println("Enter the 2nd side of the Traingle : \n");
        q = sc.nextInt();
        System.out.println("Enter the 3rd side of the Traingle : \n");
        r = sc.nextInt();
        d = great(p, q, r);
        if (d == p) {
            if (q + r > p)
                System.out.println("It is a Traingle !!!");
            else
                System.out.println("It is not a Traingle !!!");
        } else if (d == q) {
            if (p + r > q)
                System.out.println("It is a Traingle !!!");
            else
                System.out.println("It is not a Traingle !!!");
        } else {
            if (q + p > r)
                System.out.println("It is a Traingle !!!");
            else
                System.out.println("It is not a Traingle !!!");
        }
        sc.close();
    }
}
