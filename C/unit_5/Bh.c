#include <stdio.h>
long int Octal(long int num)
{
    long int rem[50], i = 0, length = 0;
    while (num > 0)
    {
        rem[i] = num % 8;
        num /= 8;
        i++;
        length++;
    }
    printf("Octal Number : \n");
    for (i = length - 1; i >= 0; i--)
        printf("%d", rem[i]);
    return 0;
}
int main()
{
    long int n;
    printf("Enter the Number : \n");
    scanf("%d", &n);
    Octal(n);
    return 0;
}