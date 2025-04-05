import java.io.*;

class Next {
  int a, n, r;
  int x;

  int Act(int x) {
    a = 1;
    n = x;
    r = 0;
    while (a <= n) {
      if (n % a == 0)
        r = r + 1;
      a = a + 1;
    }
    if (r == 2)
      return (n);
    else
      return (0);
  }
}

class OneTo50prime {
  public static void main(String[] args) throws IOException {
    Next net = new Next();
    int j, z;
    System.out.println("Prime number are between 1 to 50 ");
    j = 1;
    while (j < 51) {
      z = net.Act(j);
      if (z != 0)
        System.out.println(z);
      j += 1;
    }
  }
}