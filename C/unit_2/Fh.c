#include <stdio.h>
int main()
{
  int num1, num2;
  printf("Enter the Value of First Number : \n");
  scanf("%d", &num1);
  printf("Enter the Value of Second Number : \n");
  scanf("%d", &num2);
  printf("The Entered value of First Number is : %d \n The Entered value of Second Number is : %d\n", num1, num2);
  num1 += num2;
  num2 = num1 - num2;
  num1 -= num2;
  printf("The Final value of First Number is : %d \n The Final value of Second Number is : %d", num1, num2);
  num1 += num2;
  return 0;
}