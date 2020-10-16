package Java.unit_5;

import java.util.Scanner;

public class Bi {
    public static void main(String[] args) {
        int max,min,a[]={},i,rg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : \n");
        for (i = 0; i < 10; i++) 
            a[i] = sc.nextInt();
        min = a[0];
        max = a[0];
        for (i = 0; i < 10; i++)
        {
            if (a[i] < min)
                min = a[i];
            if (a[i] > max)
                max = a[i];
        }
        rg = max - min;
        System.out.println("The Range of Numbers is : "+rg);
    }
    
}
