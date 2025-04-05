import java.io.*;

class NmeVowelsRepeat {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char arr[] = new char[50];
    char vow[] = new char[] { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' };
    char temp[] = new char[] { '0', '0', '0', '0', '0', '0', '0', '0', '0', '0' };
    int i, count = 0;
    int j, k = 0, c = 0;
    System.out.println("Enter your name And press Enter to exit.");
    for (i = 0; i < 50; i++) {
      arr[i] = (char) br.read();
      if (arr[i] == (char) 13)
        break;
    }
    System.out.println("Your name is");
    for (i = 0; i < 50; i++) {
      if (arr[i] == (char) 13)
        break;
      System.out.print(arr[i]);
    }
    System.out.print("\n");

    for (i = 0; i < 50; i++) {
      for (j = 0; j < 10; j++) {
        if (arr[i] == vow[j]) {
          temp[k] = arr[i];
          count += 1;
          k++;
        }
      }
    }
    System.out.println("vowels=" + count);
    for (j = 0; j < 10; j++) {
      for (k = 0; k < count; k++) {
        if (vow[j] == temp[k])
          c++;
      }
      if (c > 0)
        System.out.println(vow[j] + "=" + c + " times");
      c = 0;
    }
  }
}