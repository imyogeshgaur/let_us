#include <stdio.h>
int main()
{
    double i, x, y;
    for (y = 0; y <= 6; y++)
    {
        for (x = 5.5; x <= 12.5; x++)
        {
            i = 2 + (y + 0.5 * x);
            printf("For y = %d   x  =  %d   i =  %d  \n", y, x, i);
        }
    }

    return 0;
}