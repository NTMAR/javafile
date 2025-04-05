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

class StoreMain {
  public static void main(String[] args) throws IOException {
    Next net = new Next();
    int sm;
    net.Input();
    sm = net.Cal();
    System.out.println("the Add=" + sm);
  }
}