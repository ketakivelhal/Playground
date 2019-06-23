#include <stdio.h>
int main() {
	//Type your code
  int num,second_digit;
  scanf("%d",&num);
  while(num>99)
  {
    num/=10;
  }
  second_digit=num%10;
  printf("%d",second_digit);
	return 0;
}