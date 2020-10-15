#include <stdio.h>
long double fact(long double n)
{
    long double i = 1, f = 1;
    do
    {
        f *= i;
        i++;
    } while (i <= n);
    return (f);
}
int main()
{
    long int num, j, sum = 0;
    printf("Enter the Number Upto Which you want to find the sum : ");
    scanf("%d", &num);
    for (j = 1; j <= num; j++)
        sum += j / fact(j);
    printf("Sum is : %d", sum);
    return 0;
}