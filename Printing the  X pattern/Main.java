#include <stdio.h>
int main() {
	// Type your code here
  int n,row,space,col;
  scanf("%d",&n);
  for(row=1;row<=n;row++)
  {
  	
    for(col=1;col<=n;col++)
    {
    	if((col==row)||(col==n-row+1))
          printf("*");
      	else
          printf(" ");
    }
    printf("\n");
  }
	return 0;
}