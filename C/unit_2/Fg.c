#include <stdio.h>
#include <math.h>
int main()
{
  float ang, s, c, t, sc, csc, ct;
  printf("Enter the Angle : \n");
  scanf("%f", &ang);
  s = sin(ang);
  c = cos(ang);
  t = tan(ang);
  sc = acos(ang);
  csc = asin(ang);
  ct = atan(ang);
  printf("Sine Value is : %f \n Cosine Value is : %f \n Tangent Value is : %f \n Secant Value is : %f \n Cosecant Value is : %f \n Cotangent Value is : %d", s, c, t, sc, csc, ct);
  return 0;
}