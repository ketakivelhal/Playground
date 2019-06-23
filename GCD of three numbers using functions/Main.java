import java.util.Scanner;
class Main
{
  public static int gcd(int a,int b){
    if(a==0)
      return b;
    return gcd(b%a,a);
      
  }
public static void main(String args[])
{
	//Try out your code here
  	Scanner in = new Scanner(System.in);
  	int num_1 = in.nextInt();
  	int num_2 = in.nextInt();
  	int num_3 = in.nextInt();
  	int gcd=gcd((gcd(num_1,num_2)),num_3);
  	System.out.println(gcd);
}
}
