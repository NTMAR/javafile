import java.io.*;

class ChgeLowerCase {
   public static void main(String [] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter your name");
     String sc = br.readLine();
     System.out.println("You name in LowerCase"+sc.toLowerCase());
   }
}