import java.io.*;

class DigitC {
  static int count = 0;

  static int digitAre(int no) {
    for (; no > 0; no /= 10) {
      count += 1;
    }
    return (count);
  }
}

class DigitCount {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter any number");
    int x = Integer.parseInt(br.readLine());
    System.out.println("Number of digit are " + DigitC.digitAre(x));
  }
}