#include <stdio.h>
int main()
{
    int max, min, a[10], n, i, rg;
    printf("Enter the numbers : \n");
    for (i = 0; i < 10; i++)
        scanf("%d", &a[i]);
    min = a[0];
    max = a[0];
    for (i = 0; i < n; i++)
    {
        if (a[i] < min)
            min = a[i];
        if (a[i] > max)
            max = a[i];
    }
    rg = max - min;
    printf("The Range of Numbers is : %d", rg);
    return 0;
}