import java.io.*;

class Bike {
  final void ride() {
    System.out.println("Bike is running");
  }
}

class Car extends Bike {
  void carRun() {
    System.out.println("car is running");
  }
}

class TestRideNext {
  public static void main(String[] args) throws IOException {
    Car classicBullet = new Car();
    classicBullet.ride();
    classicBullet.carRun();
  }
}