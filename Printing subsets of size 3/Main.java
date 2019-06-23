import java.util.Scanner;
class Main 
{
  public static void rotate(int list[],int n)
  {
    int sum=0;
    for(int i=0;i<n;i++)
    {
      if(i==4)
        break;
     for(int k=i+1;k<n;k++)
      for(int j=k+1;j<n;j++)
      {
      	System.out.print("("+list[i]+","+" "+list[k]+","+" "+list[j]+") ");
       
      }
      System.out.println();
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
 
      //int search=in.nextInt();
      rotate(list,n);
  	}
}