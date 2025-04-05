import java.io.*;

abstract class Vehicle {

  abstract void car();

  void bike() {
    System.out.println("Bike is running");
  }
}

class Roard extends Vehicle {

  void car() {
    System.out.println("Car is running");
  }

  void show() {
    System.out.println("Roard Constructed");
  }
}

class NonAbstctMethod {
  public static void main(String[] args) throws IOException {
    Roard NH12 = new Roard();
    NH12.show();
    NH12.car();
    NH12.bike();
  }
}