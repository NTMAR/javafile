import java.io.*;

class PriorityOne extends Thread {
  public void run() {
    System.out.println("First");
    for (int i = 1; i <= 10; i++) {
      try {
        Thread.sleep(100);
        System.out.print(i + " ");
      } catch (Exception e) {
      }
    }
  }
}

class PriorityTwo extends Thread {
  public void run() {
    System.out.println("\nSecond");
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        try {
          Thread.sleep(100);
          System.out.print(i + " ");
        } catch (Exception e) {
        }
      }
    }
  }
}

class PriorityThree extends Thread {
  public void run() {
    System.out.println("\nThird");
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 1) {
        try {
          Thread.sleep(100);
          System.out.print(1 + " ");
        } catch (Exception e) {
        }
      }
    }
  }
}

class MainThreeClassPriority {
  public static void main(String[] args) {
    PriorityOne bulb = new PriorityOne();
    PriorityTwo tesk = new PriorityTwo();
    PriorityThree oak = new PriorityThree();
    System.out.println("Default priority");
    System.out.println("Priority of bulb = " + bulb.getPriority());
    System.out.println("Priority of tesk = " + tesk.getPriority());
    System.out.println("Priority of oak = " + oak.getPriority());
    bulb.setPriority(8);
    tesk.setPriority(2);
    oak.setPriority(6);
    System.out.println("\nAfter Setting priority");
    System.out.println("Priority of bulb = " + bulb.getPriority());
    System.out.println("Priority of tesk = " + tesk.getPriority());
    System.out.println("Priority of oak = " + oak.getPriority());
    bulb.start();
    try {
      bulb.join();
    } catch (Exception e) {
    }

    tesk.start();

    try {
      tesk.join();
    } catch (Exception e) {
    }

    oak.start();

    try {
      oak.join();
    } catch (Exception e) {
    }

  }
}
