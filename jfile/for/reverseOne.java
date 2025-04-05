import java.io.*;
class reverseOne {
  public static void main(String[] args)
      throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num, digit, reverse;
    System.out.println("Enter any Number.");
    num = Integer.parseInt(br.readLine());
    reverse = 0;
    for (;num > 0;num /= 10) {
      digit = num % 10;
      reverse = (reverse * 10) + digit;
    }
    System.out.println(reverse);
  }
}
