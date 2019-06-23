import java.util.Scanner;
class Main{
  	public static int sum(int n)
    {	int i=1,sum=0;
    	while(i<=n)
        {
        	sum+=i;
          	i++;
        }
     return sum;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int inp_num=in.nextInt();
      inp_num=sum(inp_num);
      System.out.println(inp_num);
	}
}