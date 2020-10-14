#include <stdio.h>
int main()
{
    int km, cm, m;
    float in;
    printf("Enter the Distance in Kilometers : ");
    scanf("%d", &km);
    in = km * 1000 * 100 * 2.5;
    cm = km * 1000 * 100;
    m = km * 100;
    printf("The Distance in Inches is : %f \n The Distance in centimeters is : %d \n The distance in Meters is : %d", in, cm, m);
    return 0;
}