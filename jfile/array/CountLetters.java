import java.io.*;

class CountLetters {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      char arr[] = new char[100];
      int i, count = 0;
      System.out.println("Enter word");
      for (i = 0; i < 100; i++) {
         arr[i] = (char) br.read();
         if (arr[i] == (char) 13)
            break;
      }
      for (i = 0; i < 100; i++) {
         if (arr[i] == (char) 13)
            break;
         count += 1;
      }
      System.out.println("Letters=" + count);
   }
}