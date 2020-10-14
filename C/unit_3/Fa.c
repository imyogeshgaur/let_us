#include <stdio.h>
int main()
{
    int cp, sp, res;
    printf("Enter the Cost Price of the Item : \n");
    scanf("%d", &cp);
    printf("Enter the Selling Price of the Item : \n");
    scanf("%d", &sp);
    if (sp > cp)
    {
        printf("Hurray!!! 😄 I got Profit of : %d", sp - cp);
    }
    else
    {
        printf("Oh no !!!😟 I got Loss of : %d", cp - sp);
    }
    return 0;
}