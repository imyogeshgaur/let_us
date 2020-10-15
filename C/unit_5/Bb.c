#include<stdio.h>
int main()
{
  int num,fact = 1,i=1;
  printf("Enter the Number : \n");
  scanf("%d",&num);
  do
  {
      fact*=i;
      i++;
  } while (i<=num);
  printf("The factorial of %d is : %d \n",num,fact);
  return 0;
}