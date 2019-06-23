import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int row_num,col_num;
      for(row_num=1;row_num<=n;row_num++)
      {
      	for(col_num=1;col_num<=n;col_num++)
        {
        	if((col_num==row_num)||(col_num==n+1-row_num))
              System.out.print("*");
          	else
             System.out.print(" "); 
        }
        System.out.print("\n");
      }
	}
}