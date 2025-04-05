import java.io.*;

class Next {
  double si, p, r, t;

  Next(double x, double y, double z) {
    p = x;
    r = y;
    t = z;
    si = 0;
  }

  /* Constructor Create object and intialize the value of member variable */
  Next(Next obj) {
    this.p = obj.p;// net.p
    this.r = obj.r;// net.r
    this.t = obj.t;// net.t
    this.si = 0;
  }

  void Act() {
    si = (p * r * t) / 100;
    System.out.println("Interest is " + si);
  }

}

class CpyObej {
  public static void main(String[] args) throws IOException {
    double x, y, z;
    x = 1000;
    y = 10;
    z = 2;
    System.out.println("1st object");
    Next net = new Next(x, y, z);
    net.Act();
    Next you = new Next(net);
    System.out.println("Copyed Object");
    you.Act();
  }
}