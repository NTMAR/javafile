import java.io.*;
import java.lang.String;

class CheckIsEmpty {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String sc;
      System.out.println("Enter a word");
      sc = br.readLine();
      if (sc.length() == 0) {
         System.out.println("You don't enter any String");
      } else {
         System.out.println("Your Entered String is " + sc);
      }
   }
}/*
  * isEmpty method intruduced in java 1.6 version and isEmpty method return true
  * or false
  */
