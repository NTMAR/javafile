import java.io.*;

class SeriesOne extends Thread {
   int i;

   public void run() {
      try {
         for (i = 1; i <= 5; i++) {
            Thread.sleep(100);
            System.out.print(i);
            if (i < 5) {
               Thread.sleep(100);
               System.out.print("+");
            }
         }
      } catch (Exception e) {
         System.out.println("Exception generated");
      }
   }

   public static void main(String[] args) {
      SeriesOne one = new SeriesOne();
      SeriesOne two = new SeriesOne();
      System.out.println("Thread name is " + one.getName());
      one.run();
      System.out.println("\nThread name is " + two.getName());
      two.start();
   }
}