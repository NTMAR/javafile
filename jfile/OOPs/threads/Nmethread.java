import java.io.*;

class Nmethread extends Thread {
  int no;

  public void run() {
    for (no = 1; no <= 5; no++) {
      try {
        Thread.sleep(600);
        System.out.print(no);
        if (no < 5) {
          Thread.sleep(600);
          System.out.print("+");
        }
      } catch (Exception e) {
      }
    }
  }

  public static void main(String[] args) {
    Nmethread read = new Nmethread();
    Nmethread re = new Nmethread();
    read.start();
    System.out.println();
    re.start();
  }
}
/* This program has two object (class) both object method call same method they execute 
 * simultaneously 
 */