import java.io.*;

class Next {
  int a, b, c;

  Next(int x, int y, int z) {
    a = x;
    b = y;
    c = z;
  }

  Next(Next net) {
    this.a = net.a;//you.a
    this.b = net.b;//you.b
    this.c = net.c;//you.c
  }
}

class CpyCons {
  public static void main(String[] args) throws IOException {
    int x,y,z;
    x = y = z = 1;
    Next you = new Next(x,y,z);
    System.out.println("Value of 1st object"+"\n"+you.a + "\n" + you.b + "\n" + you.c);
    Next what = new Next(you);
    System.out.println("Value of 2nd object"+"\n"+what.a + "\n" + what.b + "\n" + what.c);
  }
}