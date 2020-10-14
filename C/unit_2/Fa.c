#include <stdio.h>
int main()
{
    int num, temp, sum = 0, rem;
    printf("Enter the number : \n");
    scanf("%d", &num);
    temp = num;
    while (temp != 0)
    {
        rem = temp % 10;
        sum = sum + rem;
        temp /= 10;
    }
    printf("The sum of digit is : %d", sum);
    return 0;
}