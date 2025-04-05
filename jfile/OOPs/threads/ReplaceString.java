import java.io.*;
import java.lang.String;

class ReplaceString {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter a Sentence");
      String sc = br.readLine();
      System.out.println("Which word replace");
      String cs = br.readLine();
      System.out.println("Enter new Word");
      String rep = br.readLine();
      String newString = sc.replace(cs,rep);// 'sc' store old word amd 'rep' store new word which replace old word
      System.out.println("New String = "+newString);
   }
}
