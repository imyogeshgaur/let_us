package Java.unit_4;

import java.util.Scanner;

public class Db {
    public static void main(String[] args) {
        int a;
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character : \n");
        c = sc.next().charAt(0);
        a = (int) c;
        if (a >= 65 && a <= 90)
            System.out.println("It is an UpperCase Letter !!!");
        else if (a >= 97 && a <= 122)
            System.out.println("It is a LowerCase Letter !!!");
        else if (a >= 48 && a <= 57)
            System.out.println("It is a Digit !!!");
        else
            System.out.println("It is a Symbol !!!");
        sc.close();
    }
}
