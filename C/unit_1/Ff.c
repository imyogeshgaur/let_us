#include <stdio.h>
int main()
{
    int l, b, a1, a2, a3, a4, a5, a6, a7, a8;
    printf("Considering Lenght is Grater than Breadth !!!! \n");
    printf("Enter the Lenght Of A0 ppr :");
    scanf("%d", &l);
    printf("Enter the Breadht Of A0 ppr :");
    scanf("%d", &b);
    a1 = b * (l - 1) / 2;
    a2 = (l - 1) / 2 * (b - 1) / 2;
    a3 = (b - 1) / 2 * (((l - 1) / 2) - 1) / 2;
    a4 = (((l - 1) / 2) - 1) / 2 * (((b - 1) / 2) - 1) / 2;
    a5 = (((b - 1) / 2) - 1) / 2 * (((((l - 1) / 2) - 1) / 2) - 1) / 2;
    a6 = (((((l - 1) / 2) - 1) / 2) - 1) / 2 * (((((b - 1) / 2) - 1) / 2) - 1) / 2;
    a7 = (((((b - 1) / 2) - 1) / 2) - 1) / 2 * (((((((l - 1) / 2) - 1) / 2) - 1) / 2) - 1) / 2;
    a8 = (((((((l - 1) / 2) - 1) / 2) - 1) / 2) - 1) / 2 * (((((((b - 1) / 2) - 1) / 2) - 1) / 2) - 1)/2;
    printf(" The Area of A1 sheet is : %dmmsq \n The Area of A2 sheet is : %dmmsq \n The Area of A3 sheet is : %dmmsq \n The Area of A4 sheet is : %dmmsq \n The Area of A5 sheet is : %dmmsq \n The Area of A6 sheet is : %dmmsq \n The Area of A7 sheet is : %dmmsq \n The Area of A8 sheet is : %dmmsq", a1, a2, a3, a4, a5, a6, a7, a8);
    return 0;
}