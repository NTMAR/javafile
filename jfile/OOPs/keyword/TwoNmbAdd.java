import java.io.*;

class TwoNmbAdd {
  static int i;

  static {
    i = 1;
    while (i > 0) {
      System.out.println("Virus Downloading...");
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter any number ");
    int x = Integer.parseInt(br.readLine());
    System.out.println("Enter 2nd number ");
    int y = Integer.parseInt(br.readLine());
    int z = x + y;
    System.out.println("Sum is " + z);
  }
}