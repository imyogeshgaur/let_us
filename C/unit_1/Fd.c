#include <stdio.h>
int main()
{
    int f;
    float c;
    printf("Enter the tempreature in farhenhiets :");
    scanf("%d", &f);
    c = (f - 32) / 1.8;
    printf("The Tempreature in Celcius is %f ", c);
    return 0;
}