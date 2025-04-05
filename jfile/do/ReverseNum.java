import java.io.*;

class ReverseNum {
  public static void main(String[] args)
      throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num, digit, sum;
    System.out.println("Enter any Number.");
    num = Integer.parseInt(br.readLine());
    sum = 0;
    do {
      digit = num % 10;
      sum = (sum * 10) + digit;
      num = num / 10;
    }while (num > 0);
    System.out.println("Reverse of Number="+sum);
  }
}