import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str=in.nextLine();
      int str_len=str.length();
      str_len--;
      StringBuilder sb=new StringBuilder(str);
      int j=0,i=0;
      while(i!=str_len+1)
      {
        if(sb.charAt(i)==' '||i==str_len)
          {	
          	  if(i==str_len)
                reverse_string(sb,j,i);
          	else
              reverse_string(sb,j,i-1);
          	  j=i+1;
          }
          
          i++;
      }
	  reverse_string(sb,0,str_len);
     /* j=0;
      i=0;
      while(i!=str_len+1)
      {
        if(sb.charAt(i)==' ')
          {	
              reverse_string(sb,j,i-1);
          }
          j=i+1;
          i++;
      }*/
      System.out.println(sb);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
      char ch;
      while(start_idx<end_idx)
      {
          ch=sb.charAt(start_idx);
          sb.setCharAt(start_idx,sb.charAt(end_idx));
          sb.setCharAt(end_idx,ch);
          start_idx++;
          end_idx--;
      }
    }
}