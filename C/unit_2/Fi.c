#include <stdio.h>
int main()
{
  int N, h, f, t, fi, tw, o, a, b, c, d, e;
  printf("Enter the Number : \n");
  scanf("%d", &N);
  h = N / 100;
  a = N % 100;
  f = a / 50;
  b = a % 50;
  t = b / 10;
  c = b % 10;
  fi = c / 5;
  d = c % 5;
  tw = d / 2;
  e = d % 2;
  o = e / 1;
  printf("The Number of Rs 100 denomination required : %d \n The Number of Rs 50 denomination required : %d \n The Number of Rs 10 denomination required : %d \n The Number of Rs 5 denomination required : %d \n The Number of Rs 2 denomination required : %d \n The Number of Rs 1 denomination required : %d ", h, f, t, fi, tw, o);
  return 0;
}