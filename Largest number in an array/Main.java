import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      //int c1=-1,c2=-1;
      for(int i=0;i<arr_size;i++)
      {
      arr[i]=in.nextInt();
      }
     // int n1=in.nextInt();
      //int n2=in.nextInt(); 
      int large=arr[0];
      for(int i=1;i<arr_size;i++)
      {
      if(arr[i]>large)
        large=arr[i];
      }
     // System.out.println(c1);
      System.out.println(large);
    }
}