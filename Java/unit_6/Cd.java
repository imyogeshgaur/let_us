package Java.unit_6;

import java.util.Scanner;

public class Cd {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : \n");
        n = sc.nextInt();
        for(i=1;i<=10;i++)
            System.out.println(n+" * "+i+" = "+n*i);
        sc.close();  
    }
}