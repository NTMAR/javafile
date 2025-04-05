import java.io.*;

class SetPriority extends Thread {
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
    SetPriority obj = new SetPriority();
    SetPriority obj1 = new SetPriority();
    SetPriority obj2 = new SetPriority();
    System.out.println("Default priority");
    System.out.println("Priority of obj = " + obj.getPriority());
    System.out.println("Priority of obj1 = " + obj1.getPriority());
    System.out.println("Priority of obj2 = " + obj2.getPriority());
    obj.setPriority(1);
    obj1.setPriority(4);
    obj2.setPriority(8);
    System.out.println("After Setting priority");
    System.out.println("Priority of obj = " + obj.getPriority());
    System.out.println("Priority of obj1 = " + obj1.getPriority());
    System.out.println("Priority of obj2 = " + obj2.getPriority());
    obj.start();
    obj1.start();
    obj2.start();
  }
}