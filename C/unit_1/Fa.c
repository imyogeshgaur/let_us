#include<stdio.h>
int main()
{
    int bs,gs;
    printf("Enter the Base Salary of Ramesh : ");
    scanf("%d",&bs);
    gs = bs+(bs*0.4)+(bs*0.2);
    printf("The gross salary of Ramesh is : %d ", gs);
return 0;
}