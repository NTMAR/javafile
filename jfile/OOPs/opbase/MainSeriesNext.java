import java.io.*;

class Next {
  int a, c;

  int Sri() {
    return (c);
  }
}

class MainSeriesNext {
  public static void main(String[] args) {
    Next net = new Next();
    int x;
    x = 1;

    while (x <= 10) {
      net.c = x;
      net.a = net.Sri();
      System.out.println(net.a);
      x += 1;
    }
  }
}