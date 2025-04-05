wwwimport java.io.*;

class Car {
   final int speedLimit = 120;

   void run() {
      System.out.println("Car is running");
   }
}

class TestDriveNext {
   public static void main(String[] args) throws IOException {
      Car Enova = new Car();
      Enova.run();
   }
}