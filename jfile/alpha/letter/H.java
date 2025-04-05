import java.io.*;

class H extends Thread {
  int i, j;

  void hLetter() throws Exception {
    for (i = 1; i <= 7; i++) {
      for (j = 1; j <= 5; j++) {
        if ( j == 1 || j == 5 || i == 4) {
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
    H h = new H();
    h.hLetter();
  }
}