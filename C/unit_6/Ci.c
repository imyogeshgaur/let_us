#include <stdio.h>
int main()
{
    int p = 100000, i, r;
    for (i = 0; i >= 1; i--)
    {
        printf("The Population at : %d year is %d \n", i, p - (p / 10));
    }
    return 0;
}