package Java.unit_5;

import java.util.Scanner;

public class Be {
    public static void main(String[] args) {
        int n, x, y, res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : \n");
        n = sc.nextInt();
        x = n;
        while (x != 0) {
            y = x % 10;
            res += y * y * y;
            x /= 10;
        }
        if (res == n)
            System.out.println("The number " + n + " is an Armstrong Number : ");
        else
            System.out.println("The number " + n + " isn't an Armstrong Number : ");
        sc.close();
    }

}
