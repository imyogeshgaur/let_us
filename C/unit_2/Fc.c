#include <stdio.h>
#include <math.h>
int main()
{
   float a, b, c, s, ar;
   printf("Enter the 1st side of the Traingle : ");
   scanf("%f", &a);
   printf("Enter the 2nd Side of the Traingle : ");
   scanf("%f", &b);
   printf("Enter the 3rd Side of the Traingle : ");
   scanf("%f", &c);
   s = (a + b + c) / 2;
   ar = sqrt(s * (s - a) * (s - b) * (s - c));
   printf("The Area of the Traingle is : %f", ar);
   return 0;
}