#include<stdio.h>
int main()
{ 
  int x1,x2,x3,y1,y2,y3;
  float a;
  printf("Enter the Hoizontal Coordinates of 1st Point : \n"); 
  scanf("%d",&x1); 
  printf("Enter the Hoizontal Coordinates of 2nd Point : \n"); 
  scanf("%d",&x2);  
  printf("Enter the Hoizontal Coordinates of 3rd Point : \n"); 
  scanf("%d",&x3);
  printf("Enter the Vertical Coordinates of the 1st Point : \n");
  scanf("%d",&y1);   
  printf("Enter the Vertical Coordinates of the 2nd Point : \n");
  scanf("%d",&y2);
  printf("Enter the Vertical Coordinates of the 3rd Point : \n");
  scanf("%d",&y3);
  a=1/2*(x1*(y2-y3)+x2*(y2-y1)+x3*(y1-y2));
  if(a==0.0)
    printf("Point Lie in a Line !!!");
  else 
    printf("The Point Not Lie in a line !!!")
  return 0;
}