import java.io.*;

class positiven {
   public static void main(String args[])
         throws IOException {
      InputStreamReader is = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(is);
      int a;
      System.out.print("Enter a number to check negative or positive.:");
      a = Integer.parseInt(br.readLine());
      if (a < 0)
         System.out.println(a + "is a negative number.");
      else
         System.out.println(a + "is positive number.");
   }
}