import java.io.*;

class UserNameNext {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char arr[] = new char[50];
    int i;
    System.out.println("Enter your name And press Enter to exit.");
    for (i = 0; i < 50; i++) {
      arr[i] = (char) br.read();
      if (arr[i] == (char) 13)
        break;
    }
    // here 13 is ascii of enter key
    System.out.println("Your name is");
    for (i = 0; i < 50; i++) {
      if (arr[i] == (char) 13)
        break;
      System.out.print(arr[i]);
    }
  }
}