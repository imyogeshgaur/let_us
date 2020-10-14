#include <stdio.h>
int main()
{
    int l, b, r, p, ar;
    float c, ac;
    printf("The lenght of Rectangele is : \n");
    scanf("%d", &l);
    printf("The Breadht of Rectangele is : \n");
    scanf("%d", &b);
    printf("Enter the Radius of the Circle : \n");
    scanf("%d", &r);
    p = 2 * (l + b);
    ar = l * b;
    c = 2 * 3.14 * r;
    ac = 3.14 * r * r;
    printf(" The Perimeter of the Rectangle is : %d \n The Area of Rectangle is : %d \n The Circumferrence of Circle is : %f \n The Area of Circle is : %f \n", p, ar, c, ac);
    return 0;
}