#include <stdio.h>
int main()
{
    int num;
    printf("Enter the Number : \n");
    scanf("%d", &num);
    if (num % 2 == 0)
        printf("The Number is an even number !!!");
    else
        printf("The number is an Odd number !!!!");
    return 0;
}