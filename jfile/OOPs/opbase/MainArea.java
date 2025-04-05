import java.io.*;

class Area {
  int len, Wid, hei, bse, rad, side;
  double res;

  void input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter side of square");
    side = Integer.parseInt(br.readLine());
    System.out.println("\t\t\tEnter dimension of Rectangle");
    System.out.println("Enter length");
    len = Integer.parseInt(br.readLine());
    System.out.println("Enter Width");
    Wid = Integer.parseInt(br.readLine());
    System.out.println("\t\t\tEnter dimension of circle");
    System.out.println("Enter length of radius");
    rad = Integer.parseInt(br.readLine());
    System.out.println("\t\t\tEnter dimension of Right angle triangle");
    System.out.println("Enter length of Base");
    bse = Integer.parseInt(br.readLine());
    System.out.println("Enter length of Height");
    hei = Integer.parseInt(br.readLine());

  }

  void Square() {
    System.out.println("----------------------");
    res = side * side;
    System.out.println("Area of square=" + res);
  }

  void React() {
    res = len * Wid;
    System.out.println("Area of Rectangle=" + res);
  }

  void Cir() {

    res = 3.14 * (rad * rad);
    System.out.println("Area of Circle=" + res);
  }

  void RightAngle() {
 
    res = 0.5 * (bse * hei);
    System.out.println("Area of Right Triangle=" + res);
  }
}

class MainArea {
  public static void main(String[] args) throws IOException {
    Area ar = new Area();
    ar.input();
    ar.Square();
    ar.React();
    ar.Cir();
    ar.RightAngle();
  }
}