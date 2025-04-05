import java.io.*;

class Area {
  int len, Wid;
  double res;
}
class FindArea {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Area square = new Area();
    Area rectangle = new Area();
    Area circle = new Area();
    Area rightTriangle = new Area();
    System.out.println("\t\t\t_Enter any lenghth in Centimetre_");
    /* Calculate area for Square */
    System.out.println("Enter length of side(Square)");
    square.len = Integer.parseInt(br.readLine());
    square.res = square.len * square.len;
    System.out.println("Area of Square=" + square.res);
    /* Calculate area for rectangle */
    System.out.println("\t\t\tEnter dimension of Rectangle");
    System.out.println("Enter length");
    rectangle.len = Integer.parseInt(br.readLine());
    System.out.println("Enter Width");
    rectangle.Wid = Integer.parseInt(br.readLine());
    rectangle.res = rectangle.len * rectangle.Wid;
    System.out.println("Area of Rectangle=" + rectangle.res);
    /* Calculate area for circle */
    System.out.println("\t\t\tEnter dimension of circle");
    System.out.println("Enter length of radius");
    circle.len = Integer.parseInt(br.readLine());
    circle.res = 3.14 * (circle.len * circle.len);
    System.out.println("Area of Circle=" + circle.res);
    /* Calculate area for right-angle triangle */
    System.out.println("\t\t\tEnter dimension of Right angle triangle");
    System.out.println("Enter length of Base");
    rightTriangle.Wid = Integer.parseInt(br.readLine());
    System.out.println("Enter length of Height");
    rightTriangle.len = Integer.parseInt(br.readLine());
    rightTriangle.res = 0.5 * (rightTriangle.Wid * rightTriangle.len);
    System.out.println("Area of Right Triangle=" + rightTriangle.res);
  }
}