import java.io.*;
class threegreaterm 
{
    public static void main(String args[])
    throws IOException
    {
        InputStreamReader IS = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(IS);
        int a,b,c;
        System.out.println("enter three number.");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
        if (a>b&&a>c)
        {
            System.out.println(a+" is greater.");
        }
        else if(b>c)
        {
          System.out.println(b+" is greater.");
        }  
        else
        { 
        System.out.println(c+" is greater.");
        }
    }
}
