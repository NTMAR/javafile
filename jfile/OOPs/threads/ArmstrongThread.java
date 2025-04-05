import java.io.*;

class ArmstrongThread extends Thread {
  int a, sum, Number, rem, count;

  public void run() {
    System.out.println("Armstrong number");
    count = 0;
    for (a = 100; a <= 999; a++) {
      for (Number = a; Number > 0; Number = Number / 10) {
        rem = Number % 10;
        sum = sum + (rem * rem * rem);
      }
      if (sum == a) {
        try {
          Thread.sleep(500);
          System.out.println((count += 1) + "." + a);
        } catch (Exception e) {
        }
      }
      sum = 0;
    }
    System.out.println("Total " + count + " armstrong between 100 to 999");
  }

  public static void main(String[] args) {
    ArmstrongThread ad = new ArmstrongThread();
    ad.start();
  }
}
/* Enter only three digit number */