#include<stdio.h>
int main()
{  
   int l,b,ar,pr;
   printf("Enter the Lenght of the Rectangle : \n");
   scanf("%d",&l);
   printf("Enter the Breadth of the Rectangle : \n");
   scanf("%d",&b);
   ar = l*b;
   pr = 2*(l+b);
   if(ar>pr)
    printf("The Area is Greater than it's Perimeter");
   else
    printf("The Area is Smaller than it's Perimeter");
   return 0;
}