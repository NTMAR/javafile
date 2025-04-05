import java.io.*;

class T extends Thread {
  int i, j;

  void tLetter() throws Exception {
    for (i = 1; i <= 7; i++) {
      for (j = 1; j <= 5; j++) {
        if (i == 1 || j == 3) {
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
    T t = new T();
    t.tLetter();
  }
}