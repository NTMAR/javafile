import java.io.*;

class Uturn {
  static String name;
  static int a[] = new int[]{2,5};
  static int x;

  static void arith() {
    try {
      System.out.println(4 / 0);
    } catch (ArithmeticException ae) {
      System.out.println("Exception handled");
    } finally {
      System.out.println("It will execute");
    }
  }

  static void array() {
    try {
      for (int k = 0; k <= 2; k++) {
        System.out.println(a[k]);
      }
    } catch (ArrayIndexOutOfBoundsException ai) {
      System.out.println("Exception handled");
    } finally {
      System.out.println("It will execute");
    }
  }

  static void convert() {
    name = "NITISH";
    try {
      x = Integer.parseInt(name);
    } catch (NumberFormatException ne) {
      System.out.println("Exception handled");
    } finally {
      System.out.println("It will execute");
    }
  }
}

class ExceptionDiffCFinal {
  public static void main(String[] args) {
    Uturn.arith();
    Uturn.array();
    Uturn.convert();
  }
}
