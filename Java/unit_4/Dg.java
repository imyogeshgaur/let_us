package Java.unit_4;

import java.util.Scanner;

public class Dg {
    public static void main(String[] args) {
        double bmi, h, w;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height (in Meters) : \n");
        h = sc.nextDouble();
        System.out.println("Enter the Weight (in Kilograms) : \n");
        w = sc.nextDouble();
        bmi = w / Math.pow(h, 2);
        if (bmi < 15)
            System.out.println("Starvation !!!");
        if (bmi >= 15.1 && bmi <= 17.5)
            System.out.println("Anoxeric !!!");
        if (bmi >= 17.6 && bmi <= 18.5)
            System.out.println("UnderWeight !!!");
        if (bmi >= 18.6 && bmi <= 24.9)
            System.out.println("Obese !!!");
        if (bmi >= 40)
            System.out.println("Morbidly Obese !!!");
        sc.close();
    }
}
