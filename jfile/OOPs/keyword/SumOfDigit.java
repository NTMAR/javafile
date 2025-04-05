import java.io.*;

class SumD {
  static int sum = 0;

  static int sumAre(int nmb) {
    for (; nmb > 0; nmb /= 10) {
      sum = sum + (nmb % 10);
    }
    return (sum);
  }
}

class SumOfDigit {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter any number");
    int la = Integer.parseInt(br.readLine());
    System.out.println("Sum of digit is " + SumD.sumAre(la));
  }
}