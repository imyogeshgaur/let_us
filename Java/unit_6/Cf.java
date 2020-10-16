package Java.unit_6;

import java.util.Scanner;

public class Cf {
    public static void main(String[] args) {
        double p, q, r, a, n, i = 1;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            System.out.println("Principle for the Set "+i+"\n");
            p = sc.nextDouble();
            System.out.println("Interest for the Set "+i+"\n");
            q = sc.nextDouble();
            System.out.println("Rate for the Set "+i+"\n");
            r = sc.nextDouble();
            System.out.println("Time for the Set "+i+"\n");
            n = sc.nextDouble();
        }
            for (i = 0; i < 3; i++)
            {
                a = Math.pow((1 + (r / q)), n * q);
                System.out.println("Principle for the set "+i+" is : "+p);
                System.out.println("Interest for the set "+i+" is : "+q);
                System.out.println("Rate for the set "+i+" is : "+r);
                System.out.println("Time for the set "+i+" is : "+n);

            }
            sc.close();
        }
    }
}
