import java.io.*;

interface Act {
  void first();
}

interface Bulb {
  void second();
}

class Next implements Act, Bulb {
  public void first() {
    System.out.println("Hello");
  }

  public void second() {
    System.out.println("World");
  }
}

class interfaceMulti {
  public static void main(String[] args) throws IOException {
    Next net = new Next();
    net.first();
    net.second();
  }
}
