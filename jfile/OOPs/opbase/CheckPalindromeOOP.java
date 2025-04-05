import java.io.*;

class Bubble {
  int dgt, plus;

  int OrderR(int z) {
    dgt = 0;
    while (z > 0) {
      dgt = z % 10;
      plus = (plus * 10) + dgt;
      z = z / 10;
    }
    return (plus);
  }
}

class CheckPalindromeOOP {
  public static void main(String[] args) throws IOException {
    BufferedReader $traffic = new BufferedReader(new InputStreamReader(System.in));
    Bubble bulb = new Bubble();
    System.out.println("Enter any number");
    int y = Integer.parseInt($traffic.readLine());
    int x = bulb.OrderR(y);
    if (x == y)
      System.out.println("It is Palindrome number");
    else
      System.out.println("It is not palindrome number");

  }
}