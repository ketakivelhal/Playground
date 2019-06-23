#include <stdio.h>
int main() {
	//Type your code
  int i,n;
  scanf("%d",&n);
  printf("1\n");
  for(i=2;i<=n/2;i++)
  {
  	if(n%i==0)
    {
    	printf("%d\n",i);
    }
  }
  printf("%d\n",n);
	return 0;
}