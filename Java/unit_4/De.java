package Java.unit_4;

import java.util.Scanner;

public class De {
    static int Max(int a, int b, int c) {
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
        int r, g, b, w, bl, mg, cy;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the RGB scale value for Red : \n ");
        r = sc.nextInt();
        System.out.println("Enter the RGB scale value for Green : \n ");
        g = sc.nextInt();
        System.out.println("Enter the RGB scale value for Blue : \n ");
        b = sc.nextInt();
        w = Max(r / 255, g / 255, b / 255);
        cy = ((w - (r / 255)) / w);
        mg = ((w - (g / 255)) / w);
        bl = 1 - w;
        System.out.println("The CMKY value for White : " + w);
        System.out.println("The CMKY value for Cyan : " + cy);
        System.out.println("The CMKY value for Magenta : " + mg);
        System.out.println("The CMKY value for Black : " + bl);
        sc.close();
    }
}
