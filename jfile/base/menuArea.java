import java.io.*;
class menuArea{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int a,b;
        double area;
        int Choice;
        System.out.println("Enter 1.To Calculate  Area of Rectangle");
        System.out.println("Enter 2.To Calculate  Area of Circle");
        System.out.println("Enter 3.To Calculate  Area of Right-angle triangle.");
        System.out.println("Enter your Choice.");
        Choice=Integer.parseInt(br.readLine());
        switch(Choice){
            case 1:System.out.println("Enter Length.");
            a=Integer.parseInt(br.readLine());
            System.out.println("Enter breadth.");
            b=Integer.parseInt(br.readLine());
            area=a*b;
            System.out.println("Area of Rectangle="+area);
            break;
            case 2:System.out.println("Enter Length.");
            a=Integer.parseInt(br.readLine());
            area=3.14*(a*a);
            System.out.println("Area of Rectangle="+area);
            break;
            case 3:System.out.println("Enter Length.");
            a=Integer.parseInt(br.readLine());
            System.out.println("Enter breadth.");
            b=Integer.parseInt(br.readLine());
            area=1/2*(a*b);
            System.out.println("Area of Rectangle="+area);
            break;
            default:System.out.println("You Enter Wrong Choice.");
        }
    }
}