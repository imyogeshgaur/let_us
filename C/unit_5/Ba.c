#include<stdio.h>
int main()
{  
  int t[10],i,s=0,j;
  for ( i = 0; i <=10; i++)
  {
      printf("\nEnter the Working time for Employee %d : \n",i);
      scanf("%d",&t[i]);
      if(t[i]>40)
      {
          j = t[i]-40;
          s = 12*j;
          printf("The Total Extra money given is : %d",s);
      }
      else
      {
          printf("The total Extra money given is : 0 \n");
      }
      
  }
  
  return 0;
}