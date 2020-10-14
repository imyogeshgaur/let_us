#include <stdio.h>
#include <math.h>
int main()
{
    float l1, l2, g1, g2, d;
    printf("Enter the Logitudnal Coordinates (in degree) : \n");
    scanf("%d%d", &l1, &l2);
    printf("Enter the Latitudnal Coordinates (in degrees) : \n");
    scanf("%d%d", &g1, &g2);
    d = (acos(sin(l1) * sin(l2) + cos(l1) * cos(l2) * cos(g2 - g1)));
    printf("The Distance of the Coordinates From the Origin is : %d", d * 3963);
    return 0;
}