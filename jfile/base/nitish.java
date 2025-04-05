import java.io.*;
class nitish
{
  public static void main(String []args)
             throws IOException
			 {
			   InputStreamReader is = new InputStreamReader(System.in);
			   BufferedReader br = new BufferedReader(is);
               int a,b,c;
               System.out.print("enter 1st number.:");
               a=Integer.parseInt(br.readLine());
               System.out.print("ente 2nd number.:");
               b=Integer.parseInt(br.readLine());
               c=a+b;
               System.out.println(c+"Answer");			   
			 }
}