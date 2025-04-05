import java.io.*;

class PriotyJVM extends Thread {
  int a, b, c;

  public void run() {
    try {
      a = 10;
      b = 5;
      c = a - b;
      Thread.sleep(500);
      System.out.println("Subtration is " + c);
    } catch (Exception e) {
    }
  }

  public static void main(String[] args) {
    PriotyJVM obj = new PriotyJVM();
    PriotyJVM obj1 = new PriotyJVM();
    PriotyJVM obj2 = new PriotyJVM();
    System.out.println("Priority of obj = " + obj.getPriority());
    System.out.println("Priority of obj1 = " + obj1.getPriority());
    System.out.println("Priority of obj2 = " + obj2.getPriority());
    obj.start();
    obj1.start();
    obj2.start();
  }
}