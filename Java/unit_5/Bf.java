package Java.unit_5;

import java.util.Scanner;

public class Bf {
    public static void main(String[] args) {
        int stick = 21, u, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do not Enter any Number Greater than 4 : \n");
        while (stick > 1) {
            System.out.println("Enter Your Choice : \n");
            u = sc.nextInt();
            if ((u > 0) && (u < 5)) {
                stick = u;
                System.out.println("Matching Left : \n" + stick);
            } else {
                System.out.println("You Enterd a Wrong Choice !!!");
                break;
            }
            c = 5 - u;
            stick -= c;
            System.out.println("Matchstick picked by Computer : \n" + c);
        }
        System.out.println("Computer Wins !!!");
        sc.close();
    }
}
