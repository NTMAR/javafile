import java.io.*;

class React {
   static double area(double len, double wid) {
      return (len * wid);
   }
}

class AreaRectangle {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter len of  rectangle");
      double x = Double.parseDouble(br.readLine());
      System.out.println("Enter width of rectangle");
      double y = Double.parseDouble(br.readLine());
      System.out.println("Area of rectangle " + React.area(x, y));
   }
}