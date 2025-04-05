import java.io.*;
class remainderModule
{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a,b;
        System.out.println("Enter a 1st number.");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter a 2nd number.");
        b=Integer.parseInt(br.readLine());
        a=a%b;
        System.out.println("Reamainder is "+a);
    }
    
}
