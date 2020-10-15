#include <stdio.h>
#include <math.h>
int main()
{
    double x, sum = 0;
    printf("Enter the Value of x : \n");
    scanf("%d", &x);
    for (int i = 2; i < 8; i++)
        sum += x - 1 / x + 1 / 2 * pow((x - 1 / x), i);
    printf("The Total Value after Summation : %d", sum);
    return 0;
}