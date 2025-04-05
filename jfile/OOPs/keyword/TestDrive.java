import java.io.*;

class Car {
   // This store blank in speedLimit
   final static int speedLimit;

   static {
      speedLimit = 200;
   }

   void run() {
      System.out.println("Car is running");
   }
}

class TestDrive {
   public static void main(String[] args) throws IOException {
      Car Enova = new Car();
      Enova.run();
   }
}