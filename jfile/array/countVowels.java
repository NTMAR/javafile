import java.io.*;

class countVowels {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      char arr[] = new char[50];
      int i, count = 0;
      System.out.println("Enter your name And press Enter to exit.");
      for (i = 0; i < 50; i++) {
         arr[i] = (char) br.read();
         if (arr[i] == (char) 13)
            break;
      }
      for (i = 0; i < 50; i++) {
         switch (arr[i]) {
            case 'a':
               count += 1;
               break;
            case 'e':
               count += 1;
               break;
            case 'i':
               count += 1;
               break;
            case 'o':
               count += 1;
               break;
            case 'u':
               count += 1;
               break;
            default:
               System.out.print("");
         }
         if (arr[i] == (char) 13)
            break;
      }
      System.out.println("Vowels in your name is=" + count);
   }
}