#include <stdio.h>
int fact(int n)
{
    int fact = 1, i = 1;
    do
    {
        fact *= i;
        i++;
    } while (i <= n);
    return fact;
}
int main()
{
    int n, f;
    printf("Enter The Number : \n");
    scanf("%d", &n);
    printf("The Factorial of the Number : %d", fact(n));
    return 0;
}