import java.io.*;
class jacMarks{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int marks=0;
        System.out.println("Enter your marks.");
        marks=Integer.parseInt(br.readLine());
        if(marks>=75)
            System.out.println("Distinction.");
        if(marks>=60&&marks<75)
            System.out.println("1st Division.");
        if(marks>=45&&marks<60)
            System.out.println("2nd Division.");
        if(marks>=33&&marks<45)
            System.out.println("3rd division.");
        if(marks<33)
            System.out.println("You are fail.");  
    }
}