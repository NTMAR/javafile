import java.io.*;

class Cir {
   static double area(double r) {
      return (3.14 * r * r);
   }
}

class AreaCircle {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter radius of circle");
      double x = Double.parseDouble(br.readLine());
      System.out.println("Area of circle " + Cir.area(x));
   }
}