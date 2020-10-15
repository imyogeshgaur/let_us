#include <stdio.h>
int main()
{
    int n, x, y, res = 0;
    printf("Enter the number : \n");
    scanf("%d", &n);
    x = n;
    while (x != 0)
    {
        y = x % 10;
        res += y * y * y;
        x /= 10;
    }
    if (res == n)
        printf("The number %d is an Armstrong Nymber \n", n);
    else
        printf("The number %d is not an Armstrong Nymber \n", n);

    return 0;
}