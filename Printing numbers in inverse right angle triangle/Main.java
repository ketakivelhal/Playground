#include<stdio.h>
int main()
{
    int n,num;
    scanf("%d",&n);
	for(int row_no = 1 ; row_no <=n ; row_no++)
      {
      	num=n-row_no+1;
		for(int col_no = 1 ; col_no <= (n-row_no+1) ; col_no++ ) 
          {
          	 
			 printf("%d",num--);
     
		  }	
      printf("\n");
      
	  }	
    return 0;
}