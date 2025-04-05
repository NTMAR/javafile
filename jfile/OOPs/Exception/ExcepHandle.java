import java.io.*;

class Next {
  void A() {
    int no = 10 / 0;
  }

  void B() {
    A();
  }

  void C() {
    B();
  }

  void D() {
    C();
  }

  void E() {
    try {
      D();
    } catch (ArithmeticException ae) {
      System.out.println("Exception handled");
    }
  }
}

class ExcepHandle {
  public static void main(String[] args) throws IOException {
    Next net = new Next();
    net.E();
  }
}