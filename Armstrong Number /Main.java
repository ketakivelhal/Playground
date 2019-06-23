#include <stdio.h>
int main() {
	//Type your code
  int i,n,sum=0,fraction,temp;
  scanf("%d",&n);
  temp=n;
  while(n!=0)
  {
    fraction=n%10;
  	sum = sum + fraction*fraction*fraction;
    n=n/10;
  }
  if(sum==temp)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}