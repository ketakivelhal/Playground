#include <stdio.h>
int main() {
	// Type your code here
  int n,row,space,col;
  scanf("%d",&n);
  for(row=1;row<=n;row++)
  {
  	if((row==1)||(row==n))
    {
       for(col=1;col<=n;col++)
      {
            printf("*");
      }
      printf("\n");
  	}
    else
     {
       for(col=1;col<=n;col++)
      {
         if(col==1||col==n)
            printf("*");
         else
           printf(" ");
      }
      printf("\n");
  	} 
  }
	return 0;
}