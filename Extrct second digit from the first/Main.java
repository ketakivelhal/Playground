import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
     // int second_last_digit ;
      //int first_digit;
      while(num>99)
      {
        num/=10;
        
      }
      num %= 10;
      
      //first_digit = num;
      //int sum = first_digit + last_digit;
      System.out.println(num);
	}
}