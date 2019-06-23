import java.util.Scanner;
class Main
{
  public static void maximum(int list[],int n)
  {
   int i;
    int max=list[0];
    int index=0;
    for(i=1;i<n;i++)
    {

       if(list[i]>max){
		max=list[i];
      	index=i;
       }
      }
      System.out.println(index);
    }
  
 public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++)
      list[i]=in.nextInt();
    maximum(list,n);
  }  
  
}