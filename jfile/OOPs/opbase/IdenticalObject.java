import java.io.*;

class Next {
  int a, b, c;

  Next() {
    a = 0;
    b = 0;
    c = 0;
  }

  Next(int x, int y,int z) {
    a = x;
    b = y;
    c = z;
  }

  void Sum() {
    c = a = b;
    System.out.println("Add is " + c);
  }
}

class IdenticalObject {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("1st object created");
    Next net = new Next();
    System.out.println("Enter any no.");
    int i = Integer.parseInt(br.readLine());
    System.out.println("Enter any no.");
    int j = Integer.parseInt(br.readLine());
    System.out.println("Enter any no.");
    int u = Integer.parseInt(br.readLine());
    System.out.println("Creating 2nd object");
    Next you = new Next(i, j, u);
    if (you == net) {
      System.out.println("object are identical" + "\n" + "1st object\na = " + net.a + "\nb = " + net.b + "\nc = "+ net.c + "\n2nd object\na = " + you.a + "\nb = " + you.b + "\nc = " + you.c);
    } else {
      System.out.println("Not Identical object" + "\n" + "Making identical...");
      net = you;
    }
    if (you == net) {
      System.out.println("Now they are identical");
      System.out.println("1st object\na = " + net.a + "\nb = " + net.b + "\nc = "+ net.c + "\n2nd object\na = " + you.a + "\nb = " + you.b + "\nc = " + you.c);
    }

  }
}