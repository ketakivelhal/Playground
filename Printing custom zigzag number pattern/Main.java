#include <stdio.h>
int main() {
	// Type your code here
  int n,row,space,col;
  scanf("%d",&n);
  for(row=1;row<=n;row++)
  {
  	if(row%2==1)
    {
       for(col=1;col<=n-1;col++)
      {
            printf("%d",row);
      }
      printf("%d",row+1);
      printf("\n");
  	}
    else
     {
       printf("%d",row+1);
       for(col=1;col<=n-1;col++)
      {
         printf("%d",row);
      }
      printf("\n");
  	} 
  }
	return 0;
}