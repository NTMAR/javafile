import java.io.*;
class ptnTwtyFur {
  public static void main(String[] args)
      throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int m, n, x;
    char y;
    System.out.println("Enter number of rows.");
    x = Integer.parseInt(br.readLine());
    System.out.println("Enter character.");
    y = (char) br.read();
    for (m = x; m >= 1; m--) {
      for (n = 1; n <= m; n++)
        System.out.print(" " + y);
      System.out.print("\n");
    }
  }
}