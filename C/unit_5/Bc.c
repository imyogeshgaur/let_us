#include <stdio.h>
int CalcPow(int x, int y)
{
    int i;
    int n = 1;
    ;
    for (i = 0; i < y; ++i)
        n *= x;
    return (n);
}
int main()
{
    int n, e, a;
    printf("Enter the Number : \n");
    scanf("%d", &n);
    printf("Enter the Exponent :\n");
    scanf("%d", &e);
    a = CalcPow(n, e);
    printf("The final Answer is : %d \n", a);
    return 0;
}