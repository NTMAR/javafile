import java.io.*;
class calendarStart{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a;
        System.out.println("Enter any number.");
        a=Integer.parseInt(br.readLine());
        if(a>0&&a<2)
        System.out.println(a+" -Sunday.");
        else if(a<3)
        System.out.println(a+" -Monday.");
        else if(a<4)
        System.out.println(a+" -Tuesday.");
        else if(a<5)
        System.out.println(a+" -Wednesday.");
        else if(a<6)
        System.out.println(a+" -Thrusday.");
        else if(a<7)
        System.out.println(a+" -Friday.");
        else if(a<8)
        System.out.println(a+" -Saturday.");
        else 
        System.out.println("You entered more than 7.");
    }
}
