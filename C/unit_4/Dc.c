#include<stdio.h>
int great(int a,int b,int c)
{
    if(a>b)
    {
        if(a>c)
        {
           return a;
        }
        else
        {
           return c;
        }
    }
    else if(b>c)
    {
        if(b>a)
        {
          return b;
        }
        else
        {
           return a;
        }
    }
    else
    {
       return c;
    }
}
int main()
{
  int p,q,r,d;
  printf("Enter the 1st Side of the Traingle : \n");
  scanf("%d",&p);
  printf("Enter the 2nd Side of the Traingle : \n");
  scanf("%d",&q);
  printf("Enter the 3rd Side of the Traingle : \n");
  scanf("%d",&r);
  d = great(p,q,r);
  if(d==p)
  {
      if(q+r>q)
        printf("It is a Traingle !!!");
      else
        printf("It is not a Traingle !!!");
  }
  else if(d==q)
  {
      if(p+r>q)
        printf("It is a Traingle !!!");
      else
        printf("It is not a Traingle !!!");
  }
  else
  {
      if(q+p>r)
        printf("It is a Traingle !!!");
      else 
        printf("It is not a Traingle !!!");
  }
  return 0;
}