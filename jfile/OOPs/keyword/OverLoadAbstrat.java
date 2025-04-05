import java.io.*;

abstract class Next {

   abstract void call(int len, int wid);

   abstract void call(double r);

}

class Bulb extends Next {

   void call(int len, int wid) {
      int rea = len * wid;
      System.out.println("Area of reactangle = " + rea);
   }

   void call(double r) {
      double cir = 3.14 * r * r;
      System.out.println("Area of circle " + cir);
   }

}

class OverLoadAbstrat {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Bulb net = new Bulb();
      System.out.println("Enter len");
      int x = Integer.parseInt(br.readLine());
      System.out.println("Enter wid ");
      int y = Integer.parseInt(br.readLine());
      net.call(x, y);
      System.out.println("Enter radious of circle");
      double r = Double.parseDouble(br.readLine());
      net.call(r);
   }
}
