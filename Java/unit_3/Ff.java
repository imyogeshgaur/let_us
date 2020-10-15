package Java.unit_3;

import java.util.Scanner;

public class Ff {
    public static void main(String[] args) {
        int r, s, a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age of Ram : \n");
        r = sc.nextInt();
        System.out.println("Enter the Age of Shyam : \n");
        s = sc.nextInt();
        System.out.println("Enter the Age of Ajay : \n");
        a = sc.nextInt();
        if (a < r) {
            if (a < s)
                System.out.println("Ajay is the Youngest Boy !!! ");
            else
                System.out.println("Shyam is the Youngest Boy !!! ");
        } else if (r < a) {
            if (s > r)
                System.out.println("Ram is the Youngest Boy !!! ");
            else
                System.out.println("Shyam is the Youngest Boy !!! ");
        } else {
            System.out.println("Shyam is the Youngest Boy !!! ");
        }
        sc.close();
    }
}
