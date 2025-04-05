import java.io.*;

class TwoStringCont {
   public static void main(String [] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter your first name");
       String sc = br.readLine();
       System.out.println("Enter last name");
       String cs = br.readLine();
       System.out.println("Your name is "+sc+" "+cs);
   }
}