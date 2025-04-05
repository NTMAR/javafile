
/*
 *              *
 *            * * *
 *          * * * * *
 *        * * * * * * *
 *      * * * * * * * * *
 */
import java.io.*;

class PraMidTh extends Thread {
  int m, n, space, k;

  public void run() {
    try {
      k = 1;
      for (m = 1; m <= 5; m++) {
        for (space = 5; space > m; space--) {
           Thread.sleep(100);
          System.out.print(" ");
        }
        for (n = 1; n <= k; n++) {
          Thread.sleep(100);
          System.out.print("*");
        }
        k += 2;
        System.out.print("\n");
      }
      k = 7;
      for (m = 4; m >= 1; m--) {
        for (space = m; space <= 4; space++) {
          Thread.sleep(100);
          System.out.print(" ");
        }
        for (n = 1; n <= k; n++) {
          Thread.sleep(100);
          System.out.print("*");
        }
        k -= 2;
        System.out.print("\n");
      }
    } catch (Exception e) {
    }
  }

  public static void main(String[] args) {
    PraMidTh pra = new PraMidTh();
    pra.start();
  }
}