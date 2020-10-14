#include<stdio.h>
#include<math.h>
int main()
{
  int x,y,z;
  printf("Enter the 1st side of the Traingle : \n");
  scanf("%d",&x);
  printf("Enter the 2nd side of the Traingle : \n");
  scanf("%d",&y);
  printf("Enter the 3rd side of the Traingle : \n");
  scanf("%d",&z);
  if(x==y&&y==z&&z==x)
    printf("Traingle is Equiateral !!!");
  else if(pow(x,2)+pow(y,2)==pow(z,2)||pow(x,2)+pow(z,2)==pow(y,2)||pow(y,2)+pow(z,2)==pow(x,2))
    printf("Traingle is Right Angled !!!");
  else
    printf("Traingle is Isoceles !!!");
  return 0;
}