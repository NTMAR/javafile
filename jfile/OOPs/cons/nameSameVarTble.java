import java.io.*;

class Next {
  int a, i;

  Next(int a) {
    this.a = a;
    this.i = 0;
  }

  void Act() {
    System.out.println("Table of " + a + " is");
    i = 1;
    while (i <= 10) {
      System.out.println(a + "x" + i + "=" + a * i);
      i += 1;
    }
  }
}

class nameSameVarTble {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter any number");
    int a = Integer.parseInt(br.readLine());
    Next net = new Next(a);
    net.Act();
  }
}