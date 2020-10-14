#include <stdio.h>
int main()
{
    int yr;
    printf("Enter the Year : \n");
    scanf("%d", &yr);
    if (yr % 4 == 0)
        printf("The Year is Leap Year !!!!");
    else
        printf("The Year is Not a  Leap Year !!!!");
    return 0;
}