import java.io.*;

class Next {
  static int no = 0;
  int k, x;

  void input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter no=");
    k = Integer.parseInt(br.readLine());
  }

  int table() {
    no += 1;
    return (k * no);
  }
}

class TableMainNext {
  public static void main(String[] args) throws IOException {
    int  i;
    Next net = new Next();
    net.input();
    for (i = 1; i <= 10; i++) {
      net.x = net.table();
      System.out.println(net.k + " x " + i + " = " + net.x);
    }
  }
}