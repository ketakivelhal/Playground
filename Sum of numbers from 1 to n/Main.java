import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
     // int second_last_digit ;
      //int first_digit;
      int sum = 0;
      for(int i=1;i<=n;i++)
      {
        sum = sum + i ;
      }
     // num %= 10;
      
      //first_digit = num;
      //int sum = first_digit + last_digit;
      System.out.println(sum);
	}
}