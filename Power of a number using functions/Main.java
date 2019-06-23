import java.util.Scanner;
class Main
{
  public static int power(int b,int exp){
    int ans=1,i=1;
  while(i<=exp)
  {
  	ans*=b;
    i++;
  }
   return ans; 
  }
public static void main(String args[])
{
	//Try out your code here
  	Scanner in = new Scanner(System.in);
  	int b = in.nextInt();
  	int exp = in.nextInt();
  	int power=power(b,exp);
  	System.out.println(power);
}
}
