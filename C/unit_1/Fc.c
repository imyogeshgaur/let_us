#include <stdio.h>
int main()
{
    int s1, s2, s3, s4, s5, tot, perc;
    printf("Enter marks in first subject 1 : \n ");
    scanf("%d", &s1);
    printf("Enter marks in first subject 2 : \n");
    scanf("%d", &s2);
    printf("Enter marks in first subject 3 : \n ");
    scanf("%d", &s3);
    printf("Enter marks in first subject 4 : \n");
    scanf("%d", &s4);
    printf("Enter marks in first subject 5 : \n ");
    scanf("%d", &s5);
    tot = s1 + s2 + s3 + s4 + s5;
    perc = tot / 5;
    printf("The Marks of the student is : %d \n  The Percentage of the Student is : %d \n", tot, perc);
    return 0;
}