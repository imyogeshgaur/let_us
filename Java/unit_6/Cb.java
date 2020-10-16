package Java.unit_6;

import java.util.Scanner;

public class Cb {
    static double fact(double n) {
        double j = 1, f = 1;
        do {
            f *= j;
            j++;
        } while (j <= n);
        return f;
    }

    public static void main(String[] args) {
       double num,i,sum = 0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number Upto Which You want to find the Sum : \n");
       num = sc.nextInt();
       for (i = 0; i <=num; i++)
           sum += i/fact(i);
       System.out.println("Sum is : "+sum);
       sc.close();
    }
}
