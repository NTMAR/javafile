import java.io.*;

class CampareString {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter a word");
      String sc = br.readLine();
      System.out.println("Enter a word");
      String cs = br.readLine();
      // int x = sc.compareTo(cs);
      if (sc.compareTo(cs) == 0)
         System.out.println("They are identical");
      else
         System.out.println("They are not identical");
   }
}
/*
 * campareTo() method return 0 if String match if not match method return
 * Difference of ASCII char
 */