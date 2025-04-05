import java.io.*;

class UserNmNull {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char arr[] = new char[50];
    int i;
    for (i = 0; i < 50; i++)
      arr[i] = '0';
    System.out.println("Enter your name And 0 to exit.");
    for (i = 0; i < 50; i++) {
      arr[i] = (char) br.read();
      if (arr[i] == '0')
        break;
    }
    System.out.println("Your name is");
    for (i = 0; i < 50; i++) {
      if (arr[i] == '0')
        break;
      System.out.print(arr[i]);
    }
  }
}