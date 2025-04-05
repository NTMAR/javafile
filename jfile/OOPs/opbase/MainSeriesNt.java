import java.io.*;

class Next {
  int a;
  int c;

  int Sri() {

    c++;
    return (c);
  }
}

class MainSeriesNt {
  public static void main(String[] args) {
    Next net = new Next();
    int x;
    x = 1;
    while (x <= 10) {
      net.a = net.Sri();
      System.out.println(net.a);
      x += 1;
    }
  }
}