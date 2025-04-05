import java.io.*;

class HoriTable extends Thread {
  int i, j;

  public void run() {
    try {
      for (i = 1; i <= 10; i++) {
        for (j = 1; j <= 35; j++) {
          Thread.sleep(500);
          System.out.printf("%4d", i * j);
        }
        System.out.printf("\n");
      }
    } catch (Exception e) {
    }
  }

  public static void main(String[] args) {
    HoriTable horiTable = new HoriTable();
    horiTable.start();
  }
}