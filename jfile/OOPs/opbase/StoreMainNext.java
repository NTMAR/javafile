import java.io.*;

class Next {
  int a, b, c;

  int Cal() {
    return a + b;
  }

  void Input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter 1st=");
    a = Integer.parseInt(br.readLine());
    System.out.println("Enter 2nd=");
    b = Integer.parseInt(br.readLine());
  }
}

class StoreMainNext {
  public static void main(String[] args) throws IOException {
    Next net = new Next();
    net.Input();
    net.c = net.Cal();
    System.out.println("the Add=" + net.c);
  }
}