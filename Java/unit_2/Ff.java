package Java.unit_2;

import java.util.Scanner;

public class Ff {
    public static void main(String[] args) {
        double wcf, v, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("The Tempreature of Surrounding : \n");
        t = sc.nextDouble();
        System.out.println("The Wind Velocity of Surrounding : \n");
        v = sc.nextDouble();
        wcf = 35.74 + .6215 * t + (.4275 * t - 35.75) * Math.pow(v, 16);
        System.out.println("The Wind Chill Factor of the Surrounding is : " + wcf);
        sc.close();
    }
}
