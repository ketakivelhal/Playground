import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      int slen=str.length();
      int arr[]=new int[26];
      for(int i=0;i<26;i++)
      {
      	arr[i]=0;
      }
      int temp;
      char letter;
      for(int i=0;i<slen;i++)
      {
      	if(str.charAt(i)>='a'&&str.charAt(i)<='z')
        {
          temp=str.charAt(i)-'a';
          arr[temp]++;
        }
          else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
          {
          	temp=str.charAt(i)-'A';
       		arr[temp]++;
          }  
      }
      for(int i=0;i<=25;i++)
      {
        if(arr[i]==0)
        {
        letter=(char)(i+'a');
        System.out.print(letter+" ");
        }
      }
    }
}