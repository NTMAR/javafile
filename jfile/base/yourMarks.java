import java.io.*;
class yourMarks{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a=0,b=0,c=0,d=0,i=0;
        double Percentage,Total_marks=0;
        System.out.println("*****Enter marks of 5 subjects.*****");
        System.out.println("Enter marks of maths.");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter marks of english.");
        b=Integer.parseInt(br.readLine());
        System.out.println("Enter marks of hindi");
        c=Integer.parseInt(br.readLine());
        System.out.println("Enter marks of science.");
        d=Integer.parseInt(br.readLine());
        System.out.println("Enter marks of social science.");
        i=Integer.parseInt(br.readLine());
        Total_marks=a+b+c+d+i;
        Percentage=((Total_marks/500)*100);
        System.out.println("TotalMarks="+Total_marks+"\n"+"Percentage="+Percentage);
        if(Percentage>=75&&Percentage<=100)
        System.out.println("Dinstinction.");
        else if(Percentage<75&&Percentage>=60)
        System.out.println("1st Division.");
        else if(Percentage<60&&Percentage>=45)
        System.out.println("2nd Division");
        else if(Percentage<45&&Percentage>=33)
        System.out.println("3rd Division.");
        else
        System.out.println("You are fail.");
    }
}