package Java.unit_5;

import java.util.Scanner;

public class Bg {
    public static void main(String[] args) {
        char ch;
        long num, n = 0, p = 0, z = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the Number : \n");
            num = sc.nextInt();
            if (num > 0)
                p++;
            if (num < 0)
                n++;
            if (num == 0)
                z++;
            System.out.println("Wanna Continue ?? (y/n)");
            ch = sc.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
        System.out.println("Total Positive Numbers : " + p);
        System.out.println("Total Positive Numbers : " + n);
        System.out.println("Total Zeroes : " + z);
        sc.close();
    }
}
