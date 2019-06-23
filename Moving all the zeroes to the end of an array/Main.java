import java.util.Scanner;
class Main 
{
  public static void rotate(int list[],int n)
  {
    int zero_count=0,i,temp;
    for(i=0;i<n;i++)
    {
    	if(list[i]!=0)
      {   
        temp=list[i];
        list[i]=list[zero_count];
        list[zero_count]=temp;
        zero_count++;

      }
         
    }
    for(i=0;i<n;i++)
    {
    	System.out.print(list[i]+" ");
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
 
  //  int rot=in.nextInt();
       rotate(list,n);
  	}
}