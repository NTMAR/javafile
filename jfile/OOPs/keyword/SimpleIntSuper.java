import java.io.*;

abstract class Next {
  double p, r, t;

  /* value come from Bulb class constructor through super keyword */
  Next(double p, double r, double t) {
    this.p = p;
    this.r = r;
    this.t = t;
  }

  void disp() {
    double si = (p * r * t) / 100;
    System.out.println("Simple Interest is " + si);
  }
}

class Bulb extends Next {

  Bulb(double a, double b, double c) {
    /* Call parent class constructor and Give value to that */
    super(a, b, c);
  }
}

class SimpleIntSuper {
  public static void main(String[] args) throws IOException {
    /* this value go to Bulb class constructor here name is Bulb */
    Bulb pup = new Bulb(10000, 4, 1);
    pup.disp();
  }
}