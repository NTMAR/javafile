import java.io.*;

class UserVowelsCount {
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
      if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
        count += 1;
      else if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U')
        count += 1;
      else
        System.out.print("");
      if (arr[i] == (char) 13)
        break;
    }
    System.out.println("Vowels in your name is=" + count);
  }
}
// here 13 is ascii of enter key