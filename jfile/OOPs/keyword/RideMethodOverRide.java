import java.io.*;

class Bike {
  final void ride() {
    System.out.println("Bike is running");
  }
}

class Car extends Bike {
  final void ride() {
    System.out.println("Bike is not running");
  }
}

class RideMethodOverRide {
  public static void main(String[] args) throws IOException {
    Car classicBullet = new Car();
    classicBullet.ride();
  }
}// Give error