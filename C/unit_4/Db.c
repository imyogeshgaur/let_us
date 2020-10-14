#include<stdio.h>
int main()
{ 
  int a;
  char ch;
  printf("Enter the Character : \n");
  scanf("%c",&ch);
  a = (int)ch;
  if(a>=65&&a<=90)
    printf("It is an UpperCase Letter !!!");
  else if(a>=97&&a<=122)
    printf("It is a Lowercase Letter !!!");
  else if(a>=48 && a<=57)
    printf("It is a Digit !!!");
  else
    printf("It is a Symbol !!!");
  return 0;
}