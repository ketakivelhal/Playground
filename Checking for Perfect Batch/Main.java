import java.util.Scanner;
class Main
{
  public static void batch(int list[],int n)
  {
    int flag=1;
    int sum=0;
    int sum1=0;
    for(int i=0;i<=n-3;i+=3)
    {

       for(int j=i;j<i+3;j++)
       {
        sum+=list[j];
       }
      if(i==0)
      	sum1=sum;
     	if(i!=0)
        	if(sum!=sum1)
            {
          		flag=0;
         		break;
       		}
      	sum1=sum;
      	sum=0;

      }
      if(flag==0)
       System.out.println("Not a Perfect Batch");
     else
       System.out.println("Perfect Batch");
    }
  
 public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++)
      list[i]=in.nextInt();
    batch(list,n);
  }  
  
}