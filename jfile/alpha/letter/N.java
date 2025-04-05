import java.io.*;

class N extends Thread {
  int i, j;

  void nLetter() throws Exception {
    for (i = 1; i <= 7; i++) {
      for (j = 1; j <= 7; j++) {
        if (j == 1 || j == 7 || i == j) {
          Thread.sleep(500);
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.print("\n");
    }
  }

  public static void main(String[] args) throws Exception {
    N n = new N();
    n.nLetter();
  }
}