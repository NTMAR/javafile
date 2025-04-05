import java.io.*;

interface Bubble {
  public abstract void one();

  public abstract void two();
}

class Check implements Bubble {
  public void one() {
    System.out.println("Nitish");
  }

  public void two() {
    System.out.println("Kumar");
  }
}

class twoMethod {
  public static void main(String[] args) throws IOException {
    Check obj = new Check();
    obj.one();
    obj.two();
  }
}
