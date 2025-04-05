import java.io.*;

class Square {
  static int x;

  static int call(int x) {
    return (x * x);
  }
}

class CallSqaure {
  public static void main(String[] args) {
    System.out.println("Square is " + Square.call(9));
  }
}