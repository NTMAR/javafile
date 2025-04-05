import java.io.*;

class Next {
  int a, b, c;
  
  //@ assign value to no parametrized constructor
  Next() {
    a = 10;
    b = 20;
    c = 0;
  }

  void Sum() {
    c = a + b;
    System.out.println("Addation is =" + c);
  }
}

class GiveValueConstru {
  public static void main(String[] args) throws IOException {
    Next net = new Next();
    net.Sum();
  }
}