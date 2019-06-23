#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
	for(int row_no = 1 ; row_no <=n ; row_no++)
      {
		for(int space = 1 ; space <= (n-row_no) ; space++ ) 
          {
			 printf(" ");
		  }
		for(int col_no = 1 ; col_no <= 2*row_no-1 ; col_no++)
          {
			 printf("*");
		  }
    	printf("\n");			
	  }	
    return 0;
}