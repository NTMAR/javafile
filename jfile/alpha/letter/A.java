import java.io.*;

class A {
  int i, j;

  void aLetter() {
    for (i = 1; i <= 7; i++) {
      for (j = 1; j <= 5; j++) {
        if (i == 1 && j > 1 && j < 5 || j == 1 && i > 1 || j == 5 && i > 1 || i == 4) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.print("\n");
    }
  }

  public static void main(String[] args) {
    A a = new A();
    a.aLetter();
  }
}