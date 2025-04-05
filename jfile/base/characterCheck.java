import java.io.*;
class characterCheck
{
    public static void main(String[] args) 
    throws IOException {
       InputStreamReader is = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(is);
       char ch;
       System.out.println("Enter any character.");
       ch=(char)br.read();
       if((int)ch>=48&&(int)ch<=57)     
         System.out.println(ch+" is Number.");
       else if((int)ch>=65&&(int)ch<=90 || (int)ch>=97&&(int)ch<=122)
         System.out.println(ch+" is Alpahabet.");
       else 
         System.out.println(ch+" is Symbol.");
    }
}
