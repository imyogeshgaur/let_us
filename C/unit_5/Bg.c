#include <stdio.h>
int main()
{
    char ch;
    long int num, n = 0, p = 0, z = 0;
    do
    {
        printf("Enter the Number : \n");
        scanf("%d", &num);
        if (num > 0)
            p++;
        if (num < 0)
            n++;
        if (num == 0)
            z++;
        printf("Wanna Continue (y/n)?? \n");
        scanf("%c", &ch);
    } while (ch == 'Y' || ch == 'y');
    printf("Total Positive Number : %d", p);
    printf("Total Negetive Number : %d", n);
    printf("Total Zeoes : %d", z);
    return 0;
}