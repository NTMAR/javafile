  import java.io.*;
class UserNmeTwoArray{
     public static void main(String[]args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      char arr[]=new char[50];
      char vow[]=new char[]{'A','E','I','O','U','a','e','i','o','u'};
      int i,j,count=0;
   System.out.println("Enter your name And press Enter to exit.");
    for(i=0;i<50;i++)
   {
     arr[i]=(char)br.read();
     if(arr[i]==(char)13)break;
   }
  for(i=0;i<50;i++)
  {
    for(j=0;j<10;j++)
    {
      if(arr[i]==vow[j])
       count+=1;
    }
     if(arr[i]==(char)13)break;
  }
   System.out.println("vowels presents in your name="+count);
 }
}