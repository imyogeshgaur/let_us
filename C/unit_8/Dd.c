#include <stdio.h>
int Leap(int x)
{
    int f = 0;
    if (x % 4 == 0)
        f = 1;
    else
        f = 0;
    return f;
}
int main()
{
    int yr;
    printf("Enter the Year : \n");
    scanf("%d", &yr);
    if (Leap(yr) == 1)
        printf("The Year is a Leap Year !!!");
    else
        printf("The Year is an Ordinary Year !!!");
    return 0;
}