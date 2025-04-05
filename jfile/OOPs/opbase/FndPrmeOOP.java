import java.io.*;

class Next {
  int n, prime, a;
  static int cnt=0;

  void Input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter any number.");
    n = Integer.parseInt(br.readLine());
  }

  int $prime() {
        a=1;
    while (a <= n) {
      if (n % a == 0)
        cnt += 1;

      a += 1;
    }
    if (cnt == 2)
      return (1);
    else
      return (0);
  }
}

class FndPrmeOOP {
  public static void main(String[] args) throws IOException {
    Next net = new Next();
    net.Input();
    net.prime = net.$prime();
    if (net.prime == 1)
      System.out.println("Number is prime");
    else
      System.out.println("Not prime Number");
  }
}