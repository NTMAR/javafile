import java.io.*;
class examEligible{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int semester,Attend_class;
        double Attendance,Total_days;
        System.out.println("Enter number of semester.");
        semester=Integer.parseInt(br.readLine());
        System.out.println("Enter days you attend the class.");
        Attend_class=Integer.parseInt(br.readLine());
        Total_days=26*semester;
        Attendance=(Attend_class/Total_days)*100;
        if(Attendance>=75)
        System.out.println("You are eligible for exam.");
        else
        System.out.println("You lost.");
    }
}
 