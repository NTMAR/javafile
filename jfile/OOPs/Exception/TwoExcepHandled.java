import java.io.*;

class Next {
  void A() {
    int no = 10 / 0;
  }

  void B() {
    A();
  }

  void C() {
    int n;
    String name = "NITISH";
    n = Integer.parseInt(name);
    B();
  }

  void D() {
    C();
  }

  void E() {
    try {
      D();
    } catch (ArithmeticException ae) {
      System.out.println("First Exception handled");
    } catch (NumberFormatException ne) {
      System.out.println("Second Exception Handled");
      System.out.println(ne);
    }
  }
}

class TwoExcepHandled {
  public static void main(String[] args) throws IOException {
    Next net = new Next();
    net.E();
  }
}