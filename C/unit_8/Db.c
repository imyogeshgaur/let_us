#include <stdio.h>
double Power(double x, double y)
{
    double i, n = 1;
    for (i = 0; i < y; ++i)
        n *= x;
    return (n);
}
int main()
{
    double a, b;
    printf("Enter the Base : \n");
    scanf("%d", &a);
    printf("Enter the Exponent :\n");
    scanf("%d", &b);
    printf("The Value of : %d raised to Power %d is : %d \n", a, b, Power(a, b));
    return 0;
}