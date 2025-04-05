import java.io.*;

class Next {
  int a, b, c;

  void Sum() {
    a = 10;
    b = 20;
    c = a + b;
    System.out.println("Addation of a = " + a + " and b = " + b + " is = " + c);
  }
}

class ConPro {
  public static void main(String[] args) throws IOException {
    Next net = new Next();
    net.Sum();
  }
}