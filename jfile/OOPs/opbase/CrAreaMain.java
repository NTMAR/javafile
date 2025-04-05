import java.io.*;

class Next {
  double st, c, r;

  double Cal() {
    return (3.14 * r * r);
  }

  void Input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter radius=");
    r = Double.parseDouble(br.readLine());
  }
}

class CrAreaMain {
  public static void main(String[] args) throws IOException {
    Next net = new Next();
    net.Input();
    net.st = net.Cal();
    System.out.println("Area of Circle=" + net.st);
  }
}