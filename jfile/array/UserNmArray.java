import java.io.*;
class UserNmArray{
    public static void main(String[]args)
        throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    char arr[]=null;
   int i,count=0;
System.out.println("Enter your name");
    for(i=0;i>=0;i++){
    arr[i]=(char)br.read();
    count+=1;
    if(arr[i]==0)
      break;
    }
    System.out.println("Your name is");
    for(i=0;i<=count;i++)
     System.out.print(arr[i]);
 }
}