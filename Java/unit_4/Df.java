package Java.unit_4;

import java.util.Scanner;

public class Df {
    public static void main(String[] args) {
        int f1 = 0, f2 = 0, f3 = 0, c, t, h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hardness of Steel : \n");
        h = sc.nextInt();
        System.out.println("Enter the Carbon Contents of Steel : \n");
        c = sc.nextInt();
        System.out.println("Enter the Tensile Strenght of Steel : \n");
        t = sc.nextInt();
        if (h > 50)
            f1 = 1;
        else
            f1 = 0;
        if (c > .7)
            f2 = 1;
        else
            f2 = 0;
        if (t > 5600)
            f3 = 1;
        else
            f3 = 0;
        if (f1 == 1 && f2 == 1 && f3 == 1)
            System.out.println("It is a Grade 10 Steel !!!");
        if (f1 == 1 && f2 == 1 && f3 == 0)
            System.out.println("It is a grade 9 Steel !!!");
        if (f2 == 1 && f3 == 1 && f1 == 0)
            System.out.println("It is a grade 8 Steel !!!");
        if (f1 == 1 && f3 == 1 && f2 == 0)
            System.out.println("It is a grade 7 Steel !!!");
        if (f1 == 1 || f2 == 1 || f3 == 1)
            System.out.println("It is a grade 6 Steel !!!");
        else
            System.out.println("It is a grade 5 Steel !!!");
        sc.close();
    }
}
