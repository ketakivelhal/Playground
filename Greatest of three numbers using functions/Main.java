import java.util.Scanner;
class Main
{
  public static int great(int a,int b,int c){
    int greatest;
    greatest=a>b?(a>c?a:c):(b>c?b:c);
    return greatest;
  }
public static void main(String args[])
{
	//Try out your code here
  	Scanner in = new Scanner(System.in);
  	int num_1 = in.nextInt();
  	int num_2 = in.nextInt();
  	int num_3 = in.nextInt();
  	int greatest=great(num_1,num_2,num_3);
  	System.out.println(greatest);
}
}
