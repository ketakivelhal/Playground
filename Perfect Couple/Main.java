import java.util.Scanner;
class Main 
{
  public static void rotate(int list[],int n,int search)
  {
    int sum=0;
    for(int i=0;i<n;i++)
      for(int j=i+1;j<n;j++)
      {
      	sum=list[i]+list[j];
        if(sum==search)
          System.out.println(list[i]+", "+list[j]);
      }
  }
  public static void main(String args[])
    {
    	//Try your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
    	int list[]=new int[n];
      for(int i=0;i<n;i++)
      {
          list[i]=in.nextInt();
      }
 
      int search=in.nextInt();
      rotate(list,n,search);
  	}
}