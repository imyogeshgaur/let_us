#include <stdio.h>
int main()
{
    int stick = 21, u, c;
    printf("Do not Enter any Number Greater than 4 : \n ");
    while (stick > 1)
    {
        printf("Enter Your Choice : \n");
        scanf("%d", &u);
        if ((u > 0) && (u < 5))
        {
            stick = u;
            printf("Matching Left : %d \n", stick);
        }
        else
        {
            printf("You Entered a Wrong Choice !!!");
            break;
        }
        c = 5 - u;
        stick -= c;
        printf("Matchstick picked by Computer %d \n", c);
    }
    printf("Comuputer Wins !!!");
    return 0;
}