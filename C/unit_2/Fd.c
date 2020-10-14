#include <stdio.h>
#include <math.h>
int main()
{
  float x, y, r, th;
  printf("Enter the Horizontal Cartesian Coordinates : \n");
  scanf("%f", &x);
  printf("Enter the Vertical Cartesian Coordinates : \n");
  scanf("%f", &y);
  r = sqrt(pow(x, 2) + pow(y, 2));
  th = atan(y / x);
  printf("The Polar Coordinates are given by : \n");
  printf("r = %d\n", r);
  printf("Angle = %d", (th * 180) / 3.14);
  return 0;
}