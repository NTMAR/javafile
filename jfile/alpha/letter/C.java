import java.io.*;

class C extends Thread {
  int i, j;

  void cLetter() throws InterruptedException {
    for (i = 1; i <= 7; i++) { 
      for (j = 1; j <= 5; j++) {
        if (i == 1 && j > 1 && j < 5 || i == 7 && j > 1 && j < 5 || j == 1 && i > 1 && i < 7 || j == 5 && i > 1 && i < 3
            || j == 5 && i > 5 && i < 7) {
          Thread.sleep(500);
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.print("\n");
    }
  }

  public static void main(String[] args) throws InterruptedException {
    C c = new C();
    c.cLetter();
  }
}