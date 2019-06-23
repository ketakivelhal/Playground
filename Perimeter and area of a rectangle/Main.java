#include<stdio.h>
int main()
{
  //Type your code here
  int breadth=9,length=6,perimeter,area;
  perimeter=2*(breadth+length);
  area=breadth*length;
  printf("The perimeter of the rectangle is: %d cm\nThe area of the rectangle is: %d sq cm",perimeter,area);
  return 0;
}