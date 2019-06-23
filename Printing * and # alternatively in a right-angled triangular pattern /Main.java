#include<stdio.h>
int main()
{
    int n,num=1;
    scanf("%d",&n);
	for(int cur_row =1; cur_row <= n; cur_row++) 
       {
		  for(int cur_col=1; cur_col <= cur_row ; cur_col++) 
            {
            	if(num%2==1)
                {
                  printf("*");
                }
            	else
                {
                	printf("#");
                }
            	num+=1;
			}
		  printf("\n");
	  }
	return 0;
}