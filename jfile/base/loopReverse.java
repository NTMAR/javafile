import java.io.*;

class loopReverse {
  public static void main(String[] args)
      throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num, digit, sum;
    System.out.println("Enter any Number.");
    num = Integer.parseInt(br.readLine());
    sum = 0;
    while (num > 0) {
      digit = num % 10;
      sum = (sum * 10) + digit;
      num = num / 10;
    }
    System.out.println(sum);
  }
}