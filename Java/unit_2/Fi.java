package Java.unit_2;

import java.util.Scanner;

public class Fi {
    public static void main(String[] args) {
        int N,h,f,t,fi,tw,o,a,b,c,d,e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : \n");
        N = sc.nextInt();
        h=N/100;
        a=N%100;
        f=a/50;
        b=a%50;
        t=b/10;
        c=b%10;
        fi=c/5;
        d=c%5;
        tw=d/2;
        e=d%2;
        o=e/1;
        System.out.println("Number of Rs 100 notes required : "+h+"\n");
        System.out.println("Number of Rs 50 notes required : "+f+"\n");
        System.out.println("Number of Rs 10 notes required : "+t+"\n");
        System.out.println("Number of Rs 5 notes required : "+fi+"\n");
        System.out.println("Number of Rs 2 notes required : "+tw+"\n");
        System.out.println("Number of Rs 1 notes required : "+o+"\n");
        sc.close();
    }
}
