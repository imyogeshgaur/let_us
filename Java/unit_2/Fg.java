package Java.unit_2;

import java.util.Scanner;

public class Fg {
    public static void main(String[] args) {
        double ang, s, c, t, sci, csc, ct;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Angle : ");
        ang = sc.nextDouble();
        s = Math.sin(ang);
        c = Math.cos(ang);
        t = Math.tan(ang);
        sci = Math.acos(ang);
        csc = Math.asin(ang);
        ct = Math.atan(ang);
        System.out.println("Sine Value is : " + s);
        System.out.println("Cosine Value is : " + c);
        System.out.println("Tangent Value is : " + t);
        System.out.println("Secant Value is : " + sci);
        System.out.println("Cosecant Value is : " + csc);
        System.out.println("Cotangent Value is : " + ct);
        sc.close();
    }
}
