#include <stdio.h>
#include <math.h>
int main()
{
    double p, q, r, a, n, i = 1;
    for (i = 0; i < 3; i++)
    {
        printf("Principle for the set %d is : \n", i);
        scanf("%d", &p);
        printf("Interest for set %d is : \n", i);
        scanf("%d", &q);
        printf("Rate for set %d is : \n", i);
        scanf("%d", &r);
        printf("Time for set %d is : \n", i);
        scanf("%d", &n);
    }
    for (i = 0; i < 3; i++)
    {
        a = pow((1 + (r / q)), n * q);
        printf("Principle for set %d = %d \n", i, p);
        printf("Interest for set %d = %d \n", i, q);
        printf("Rate for set %d = %d \n", i, r);
        printf("Time for set %d = %d \n", i, n);
    }

    return 0;
}