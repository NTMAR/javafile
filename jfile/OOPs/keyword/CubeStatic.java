import java.io.*;

class Cube {
   static int cube(int x) {
      return (x * x * x);
   }
}

class CubeStatic {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter number");
      int no = Integer.parseInt(br.readLine());
      System.out.println("Cube is " + Cube.cube(no));
   }
}