package Java.unit_3;

import java.util.Scanner;

public class Fi {
    public static void main(String[] args) {
        int l, b, ar, pr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Rectangle : \n");
        l = sc.nextInt();
        System.out.println("Enter the Bredth of the Rectangle : \n");
        b = sc.nextInt();
        ar = l * b;
        pr = 2 * (l + b);
        if (ar > pr)
            System.out.println("Area is Greater than its Perimeter !!!");
        else
            System.out.println("Area is Less than the Perimeter !!!");
        sc.close();
    }
}
