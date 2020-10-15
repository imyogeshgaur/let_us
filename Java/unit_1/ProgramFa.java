package Java.unit_1;

import java.util.Scanner;

public class ProgramFa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base Salary of Ramesh \n");
        int bs = sc.nextInt();
        double ts = bs+0.4*bs+0.2*bs;
        System.out.
        println("The Total salary of Ramesh is : \n"+ts);
        sc.close();
    }
}
