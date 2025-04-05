import java.io.*;

class YourNmArray {
  public static void main(String[] args)
      throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char arr[] = new char[6];
    int i;
    System.out.println("Enter your name");
    for (i = 0; i < 6; i++) {
      arr[i] = (char) br.read();
      System.out.print("m\n");
    }
    System.out.println("Your name is");
    for (i = 0; i < 6; i++)
      System.out.print(arr[i]);
  }
}