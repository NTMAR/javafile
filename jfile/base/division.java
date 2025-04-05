import java.io.*;
class division
{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
         int a,b,c;
         System.out.println("Enter 1st number.");
         a=Integer.parseInt(br.readLine());
         System.out.println("Enter 2nd number.");
         b=Integer.parseInt(br.readLine());
         c=a/b;
         System.out.println("Quotient is "+c); 
         c=a%b;
         System.out.println("Remainder is "+c);       
    }
}
