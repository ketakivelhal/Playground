#include <stdio.h>
int main() {
	//Type your code
  int num,sum=0,first_digit;
  scanf("%d",&num);
  first_digit=num%10;
  while(num>9)
  {
    num/=10;
  }
  sum=num+first_digit;
  printf("%d",sum);
	return 0;
}