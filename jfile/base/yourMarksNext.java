import java.io.*;
class yourMarksNext{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a,b,c,d,i;
        a=b=c=d=i=0;
        double Total_marks;
        double Percentage;
        System.out.println("Enter marks of 5 subjects.");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
        d=Integer.parseInt(br.readLine());
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