import java.io.*;

class Bike {
   final void ride(){
      System.out.println("Bike is running");
   }
}

class TestRide{
  public static void main(String [] args) throws IOException {
    Bike  classicBullet = new Bike();
    classicBullet.ride();
  }
}