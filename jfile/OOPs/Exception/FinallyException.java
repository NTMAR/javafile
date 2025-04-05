import java.io.*;

class Next {
  void act() {
    try {
      System.out.println(10 / 0);
    } catch (ArithmeticException e) {
      System.out.println("This is Exception part");
    }

    finally {
      System.out.println("It will always execute");
    } /*
       * @finally keyword
       * This will always execute, only in context of try and catch block
       * This keyword used to handle any exception
       */
  }
}

class FinallyException {
  public static void main(String[] args) {
    Next net = new Next();
    net.act();
  }
}