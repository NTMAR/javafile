import java.io.*;

class IsWordCap {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      char arr[] = new char[100];
      char upp[] = new char[26];
      int i, j, k, count = 0;
      k = 65;
      for (j = 0; j < 26; j++) {
         upp[j] = (char) k;
         k += 1;
      }
      System.out.println("Enter word");
      try{
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
      for (i = 65; i < 90; i++)
         System.out.println(upp[i]);
   } catch (Exception e){}

   }
}