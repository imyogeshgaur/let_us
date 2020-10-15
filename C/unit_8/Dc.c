#include <stdio.h>
int main()
{
    int yr, i, j, v, x, l, c, d, m, p, q, r, s, t, u;
    printf("enter the Year : \n");
    scanf("%d", &yr);
    printf("Roman Equivalent of Year : %d is : \n", yr);
    m = yr / 1000;
    for (j = 1; j <= m; j++)
        printf(" m ");
    p = yr % 1000;
    d = p / 500;
    for (j = 1; j <= d; j++)
        printf(" d ");
    q = p % 500;
    c = q / 100;
    for (j = 1; j <= c; j++)
        printf(" c ");
    r = q % 100;
    l = r / 500;
    for (j = 1; j < l; j++)
        printf(" l ");
    s = r % 50;
    x = s / 10;
    for (j = 1; j <= x; j++)
        printf(" x ");
    t = s % 10;
    v = t / 5;
    for (j = 1; j <= v; j++)
        printf(" v ");
    u = t % 5;
    i = u / 1;
    for (j = 1; j <= i; j++)
        printf(" i ");
    return 0;
}