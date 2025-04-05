import java.io.*;

class D {
  int i, j;

  void dLetter() {
    for (i = 1; i <= 7; i++) {
      for (j = 1; j <= 5; j++) {
        if (i == 1 && j < 5 || i == 7 && j < 5 || j == 1 || j == 5 && i > 1 && i < 7) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.print("\n");
    }
  }

  public static void main(String[] args) {
    D d = new D();
    d.dLetter();
  }
}