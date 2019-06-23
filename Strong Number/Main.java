#include <stdio.h>
int factorial(int n)
{
  	int i=n;
	while(n>1)
    {
    	i*=--n;
    }
  return i;
}
int main() {
	//Type your code
  int i,n,sum=0,fraction,temp;
  scanf("%d",&n);
  temp=n;
  while(n!=0)
  {
    fraction=n%10;
  	sum = sum + factorial(fraction);
    n=n/10;
  }
  if(sum==temp)
    printf("Yes");
  else
    printf("No");
	return 0;
}