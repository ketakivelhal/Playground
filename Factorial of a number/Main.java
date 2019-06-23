#include <stdio.h>
int main() {
	//Type your code
  int i,n,factorial;
  scanf("%d",&n);
  factorial=n;
  for(i=2;i<n;i++)
    factorial*=i;
  printf("%d",factorial);
	return 0;
}