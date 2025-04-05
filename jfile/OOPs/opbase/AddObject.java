import java.io.*;
class Input{
     int a,b,c;
}
class AddObject{
   public static void main(String []args) throws IOException{
     BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
     Input take = new Input();
     int sum;
     System.out.println("Enter 1st no.");
     take.a=Integer.parseInt(br.readLine());
     System.out.println("Enter 2nd no.");
     take.b=Integer.parseInt(br.readLine());
     System.out.println("Enter 3rd no.");
     take.c=Integer.parseInt(br.readLine());
     sum=take.a+take.b+take.c;
     System.out.println("Result="+sum);
    
 }
}