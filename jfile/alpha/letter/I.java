import java.io.*;

class I extends Thread {
  int i, j;

  void iLetter() throws Exception {
    for (i = 1; i <= 7; i++) {
      for (j = 1; j <= 5; j++) {
        if (i == 1 || i == 7 || j == 3) {
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
    I ii = new I();
    ii.iLetter();
  }
}