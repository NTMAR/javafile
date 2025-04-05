import java.io.*;

class E extends Thread {
  int i, j;

  void eLetter() throws InterruptedException {
    for (i = 1; i <= 7; i++) {
      for (j = 1; j <= 5; j++) {
        if (i == 1 || i == 7 || j == 1 || i == 4) {
          Thread.sleep(500);
          System.out.print("* ");
        } else {
          Thread.sleep(500);
          System.out.print("  ");
        }
      }
      System.out.print("\n");
    }
  }

  public static void main(String[] args) throws InterruptedException {
    E e = new E();
    e.eLetter();
  }
}