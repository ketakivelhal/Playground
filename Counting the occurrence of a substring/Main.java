import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str1=in.nextLine();
   	  String str2=in.nextLine();
      int len1=str1.length();
      int len2=str2.length();
      int i,j,count=0;
      for(i=0;i<len1-len2+1;i++)
      {
      	for(j=0;j<len2;j++)
        {
        	if(str1.charAt(i+j)!=str2.charAt(j))
              break;
        }
        if(j==len2)
          count++;
      }
      System.out.println(count);
    } 
}