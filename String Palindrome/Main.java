import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      int front=0;
      int str_len=str.length();
      int rear=str_len-1;
      boolean is_pal=true;
      while(front<rear)
      {
      	if(str.charAt(front)!=str.charAt(rear))
        {
        	is_pal=false;
          	break;
        }
        front++;
        rear--;
      }
      if(is_pal==true)
        System.out.println("Yes");
      else if(is_pal==false)
        System.out.println("No");
    } 
}