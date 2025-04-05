import java.io.*;

class Bubble {
  int  dgt, plus;

  int OrderR(int z) {
    dgt = 0;
    while (z > 0) {
      dgt = z % 10;
      plus = (plus * 10) + dgt;
      z = z / 10;
    }
    return (plus);
  }
}

class ReverseADDOOP {
  public static void main(String[] args) throws IOException {
    BufferedReader $traffic = new BufferedReader(new InputStreamReader(System.in));
    Bubble bubb = new Bubble();
    System.out.println("Enter any number");
    int y = Integer.parseInt($traffic.readLine());
    int x = bubb.OrderR(y);
    System.out.println("Reverse is " + x);
  }
}