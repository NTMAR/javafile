import java.io.*;

class ChgUpperCase {
   public static void main(String [] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter your name");
     String sc = br.readLine();
     System.out.println("You name in UpperCase "+sc.toUpperCase());
   }
}