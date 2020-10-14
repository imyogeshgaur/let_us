#include<stdio.h>
int main()
{
   int a1,a2,a3;
   printf("Enter the 1st Angle of the Traingle !!!!");
   scanf("%d",&a1);
   printf("Enter the 2nd Angle of the Traingle !!!");
   scanf("%d",&a2);
   printf("Enter the 3rd Angle of the Traingle !!!");
   scanf("%d",&a3);
   if(a1+a2+a3==180)
    printf("It is a Valid Traingle!!!");
   else 
    printf("It is an Invalid Traingle !!!");
   return 0;
}