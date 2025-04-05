import java.io.*;

class Next {
  int a, n, r, x;

  void Act(int x, int z) {
    r = 0;
    System.out.println("Prime number are between 1 to 50 ");
    while (x < z) {
      a = 1;
      n = x;
      r = 0;
      while (a <= n) {
        if (n % a == 0)
          r = r + 1;
        a = a + 1;
      }
      if (r == 2)
        System.out.println(n);

      x += 1;
    }
  }
}

class Prime1To50Cnt {
  public static void main(String[] args) throws IOException {
    Next net = new Next();
    net.Act(1,51);
  }
}