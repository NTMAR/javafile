import java.io.*;

class StringTakeName {
  public static void main(String [] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String sc;
     System.out.println("Enter your name ");
     sc = br.readLine();
     System.out.println("Your name is "+sc);
     System.out.print("The length is "+sc.length());
  }
}