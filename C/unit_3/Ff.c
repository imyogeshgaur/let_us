#include<stdio.h>
int main()
{
  int r,s,a;
  printf("Enter The Age of Ram : \n");
  scanf("%d",&r);
  printf("Enter The Age of Shyam : \n");
  scanf("%d",&s);
  printf("Enter the Age of Ajay : \n");
  scanf("%d",&a);
  if(a<r){
      if(a<s)
        printf("Ajay is Youngest !!!");
      else
        printf("Shyam is Youngest !!!");
  }
  else if(r<a){
      if(s>r)
        printf("Ram is Youngest !!!");
      else
        printf("Shyam is Youngest !!!");
  }
  else
    printf("Shyam is Youngest !!!");
  return 0;
}