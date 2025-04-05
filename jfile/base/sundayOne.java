import java.io.*;
class sundayOne{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(is);
        int number;
        System.out.println("Enter number 1 to 7.");
        number=Integer.parseInt(br.readLine());
        switch(number){
            case 1:System.out.println("Sunday.");
            break;
            case 2:System.out.println("Monday.");
            break;
            case 3:System.out.println("Tuesday.");
            break;
            case 4:System.out.println("Wednesday.");
            break;
            case 5:System.out.println("Thrusday.");
            break;
            case 6:System.out.println("Friday.");
            break;
            case 7:System.out.println("saturday.");
            default:System.out.println("Wrong number Entered.");

        }
    }
}