#include <stdio.h>
int main()
{
    int i = 0;
    do
    {
        print("%c", i);
        i++;
    } while (i <= 255);

    return 0;
}