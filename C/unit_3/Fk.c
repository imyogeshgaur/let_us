#include<stdio.h>
int main()
{
  int x,y,x1,y1,r,d;
  printf("Enter the Horizontal Coordinates of the Center : \n");
  scanf("%d",&x);
  printf("Enter the Vertical Component of the Center : \n");
  scanf("%d",&y);
  printf("Enter the Radius of the Circle : \n");
  scanf("%d",&r);
  printf("Enter the Horizontal Component of the Point :\n");
  scanf("%d",&x1);
  printf("Enter the Vertical Component of the Point : \n");
  scanf("%d",&y1);
  d=abs(sqrt(pow(x-x1,2)+pow(y-y1,2)));
  if(d>r)
    printf("The Point Lies Outside the Circle !!!");
  else if(d==r)
    printf("The Point Lies On the Circle !!!");
  else
    printf("The Point Lies Inside The Circle !!!");
  return 0;
}