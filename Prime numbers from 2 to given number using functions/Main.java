import java.util.Scanner;
class Main
{
  public static void prime(int n){
    int i=3,k,count=0;
    System.out.println("2");
  	while(i<=n)
    {
    	for(k=2;k<=i/2;k++)
        {
        	if(i%k==0){
              count=1;
              break;
            }
        }
      if(count==0)
        System.out.println(i);
      count=0;
      i++;
    }
 	
  }
public static void main(String args[])
{
	//Try out your code here
  	Scanner in = new Scanner(System.in);
  	int n = in.nextInt();
  	//int exp = in.nextInt();
  	prime(n);
}
}
