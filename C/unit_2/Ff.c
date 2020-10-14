#include <stdio.h>
#include <math.h>
int main()
{
  float wcf, v, t;
  printf("The Tempreature of the Surrounding : \n");
  scanf("%f", &t);
  printf("The Wind Velocity of the Surrounding : \n");
  scanf("%f", &v);
  wcf = 35.74 + .6215 * t + (.4275 * t - 35.75) * pow(v, .16);
  printf("The Wind Chill Factor of the Surrounding is : %f", wcf);
  return 0;
}