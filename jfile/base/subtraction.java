import java.io.*;
class subtraction {
 public static void main(String args[]) throws Exception {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int a,b,c;
  System.out.println("Enter the 1st no.:");
  a = Integer.parseInt(br.readLine());
  System.out.println("Enter the 2nd no.");
  b = Integer.parseInt(br.readLine());
  c = a - b;
  System.out.println("\nsubtration of two numbers:" + c);
 }
}