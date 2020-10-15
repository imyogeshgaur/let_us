package Java.unit_3;

import java.util.Scanner;

public class Fa {
    public static void main(String[] args) {
        int cp, sp, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost Price of the item : \n");
        cp = sc.nextInt();
        System.out.println("Enter the Selling Price of the item : \n");
        sp = sc.nextInt();
        res = sp - cp;
        if (sp > cp)
            System.out.println("Hurray I got Profit of : " + res);
        else
            System.out.println("Oh I got Loss of : " + res);
        sc.close();
    }
}
