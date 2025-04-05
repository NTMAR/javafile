import java.io.*;
class InputOne{
     int a;
}
class AddSingleVar{
   public static void main(String []args) throws IOException{
     BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
     InputOne take = new InputOne();
     InputOne data = new InputOne();
     InputOne sum = new InputOne();
     System.out.println("Enter 1st no.");
     take.a=Integer.parseInt(br.readLine());
     System.out.println("Enter 2nd no.");
     data.a=Integer.parseInt(br.readLine());
     sum.a=take.a+data.a;
     System.out.println("Result="+sum.a);
    
 }
}