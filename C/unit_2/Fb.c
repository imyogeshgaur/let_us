#include <stdio.h>
int main()
{
  int num, rev = 0, rem;
  printf("Enter the Number : \n");
  scanf("%d", &num);
  while (num != 0)
  {
    rem = num % 10;
    rev = rev * 10 + rem;
    num /= 10;
  }
  printf("The Reverse of the number is : %d", rev);
  return 0;
}