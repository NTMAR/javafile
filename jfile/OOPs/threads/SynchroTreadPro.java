import java.io.*;

class SynchroTreadPro extends Thread {
  public void run() {
    for (int i = 1; i <= 10; i++) {
      try {
        Thread.sleep(200);
        System.out.println(i);
      } catch (Exception e) {
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    SynchroTreadPro synchroTreadPro = new SynchroTreadPro();
    SynchroTreadPro synchroTreadProTwo = new SynchroTreadPro();
    synchroTreadPro.start();
    synchronized (synchroTreadPro) {
      synchroTreadPro.wait(5000);
    }
    synchroTreadProTwo.start();
  }

}